package com.alg.oodesign.editor.view;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.alg.oodesign.editor.model.BufferManager;
import com.alg.oodesign.editor.model.CommandManager;
import com.alg.oodesign.editor.model.CopyCommand;
import com.alg.oodesign.editor.model.CutCommand;
import com.alg.oodesign.editor.model.DeleteCommand;
import com.alg.oodesign.editor.model.InsertCommand;
import com.alg.oodesign.editor.model.OpenCommand;
import com.alg.oodesign.editor.model.PasteCommand;
import com.alg.oodesign.editor.model.SaveCommand;

@SuppressWarnings("serial")
public class NotepadGUI extends JFrame {
	private JTextArea txtArea;
	private BufferManager buffer_mgr;
	private CommandManager cmd_mgr;
	
	public void buildMenu(JMenu menu, String[] items, String[] commands, char[] mnemonics, int[] accelerators, ActionListener listener) {
		     for (int i = 0; i < items.length; i++) {
		         JMenuItem item = new JMenuItem(items[i]);
		         item.addActionListener(listener);
		         item.setActionCommand(commands[i]);
		         if (mnemonics[i] != 0) 	item.setMnemonic((char) mnemonics[i]);
		         if (accelerators[i] != 0) 	item.setAccelerator(KeyStroke.getKeyStroke(accelerators[i], java.awt.Event.CTRL_MASK));
		         menu.add(item);
		     }
	}
		 
	public void init_menubar(JMenuBar menubar) {			 
		     String[] file_items = new String[] { "Open", "Save", "Exit" };
		     String[] file_commands = new String[] { "open", "save", "exit" };
		     char[] file_mnemonics = { 'O', 'S', 'X' };
		     int[] file_accelerators = { KeyEvent.VK_O, KeyEvent.VK_S, KeyEvent.VK_X }; 
		     
		     String[] edit_items = new String[] { "Undo", "Redo", "Cut", "Copy", "Paste", "Delete" };
		     String[] edit_commands = new String[] { "undo", "redo", "cut", "copy", "paste", "delete" };
		     char[] edit_mnemonics = { 'U', 'R', 'C', 0, 'V', 'D' };
		     int[] edit_accelerators = { KeyEvent.VK_U, KeyEvent.VK_R, KeyEvent.VK_C, 0, KeyEvent.VK_V, KeyEvent.VK_D }; 
		        
		     JMenu file_menu = new JMenu("File");
		     file_menu.setMnemonic(KeyEvent.VK_F);
		     menubar.add(file_menu);
		     ActionListener file_menu_action_listener = new FileMenuActionListener(this);
		     buildMenu(file_menu, file_items, file_commands, file_mnemonics, file_accelerators, file_menu_action_listener);
		     file_menu.insertSeparator(2);
		     
		     JMenu edit_menu = new JMenu("Edit");
		     edit_menu.setMnemonic(KeyEvent.VK_E);
		     menubar.add(edit_menu);
		     ActionListener edit_menu_action_listener = new EditMenuActionListener(this);
		     buildMenu(edit_menu, edit_items, edit_commands, edit_mnemonics, edit_accelerators, edit_menu_action_listener);	
		     edit_menu.insertSeparator(2);
		     edit_menu.insertSeparator(5); 
	}
	
	public void update() {
			//System.out.println(buffer_mgr.getBufferContent());
			txtArea.setText(buffer_mgr.getBufferContent());
	}
		 
	public NotepadGUI() {
			 super("NotePad");			 
			 
		     this.txtArea = new JTextArea(24, 54);
		     this.buffer_mgr = new BufferManager();
		     this.cmd_mgr = new CommandManager();
		     
		     //txtArea.getDocument().addDocumentListener(new MyDocumentListener(this) );
		     
		     // Sets formatting to break line at whole words, and adding some border to the JTextArea.
		     txtArea.setLineWrap(true);
		     txtArea.setWrapStyleWord(true);
		     txtArea.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		     // If content exceeds size of viewport, make scrolling through the content possible
		     JScrollPane scrollPane = new JScrollPane(txtArea);

	         // Adding menus and JTextArea to the JFrame
		     JMenuBar menubar = new JMenuBar();
			 setJMenuBar(menubar);
			 init_menubar(menubar);
		     add(scrollPane, BorderLayout.SOUTH);

		     // Presenting the JFrame, and stating the programs close operation
		     setVisible(true);
		     pack();
		     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}		

		
	public static void main(String[] args) {
		new NotepadGUI();
	}
		     
	class FileMenuActionListener implements ActionListener {
		private NotepadGUI parent;
		private File file;
		private JFileChooser fileCh = new JFileChooser(".");
		
		public FileMenuActionListener(NotepadGUI parent) {
			this.parent = parent;
		}
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			String choice = ae.getActionCommand();
			if (choice.equals("exit")) {
				System.exit(0);
			}//end of exit
			else if (choice.equals("open")) {
				int userChoice = fileCh.showOpenDialog(parent);
				if (userChoice == JFileChooser.APPROVE_OPTION) {
					file = fileCh.getSelectedFile();
					cmd_mgr.invoke(new OpenCommand(buffer_mgr, file));
					update();
				}
			}//end of open
			else if(choice.equals("save")) {
					if(file == null) {
						int userChoice = fileCh.showOpenDialog(parent);
						if (userChoice == JFileChooser.APPROVE_OPTION)
							file = fileCh.getSelectedFile();
					}
					cmd_mgr.invoke(new SaveCommand(buffer_mgr, file));
			}//end of save
			
		}//end of method
		
	}//end of listener

	class EditMenuActionListener implements ActionListener {
		private NotepadGUI parent;
		
		public EditMenuActionListener(NotepadGUI parent) {
			this.parent = parent;
		}	
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			String choice = ae.getActionCommand();
			if (choice.equals("cut")) {
				if(txtArea.getSelectedText() != null) {
	                  int begin = txtArea.getSelectionStart();
	                  int end = txtArea.getSelectionEnd();
	                  System.out.println(begin + "," + end);
	                  cmd_mgr.invoke(new CutCommand(buffer_mgr, begin, end));
	                  update();
	            }
			}//end of cut
			else if (choice.equals("copy")) {
				if(txtArea.getSelectedText() != null) {
	                  int begin = txtArea.getSelectionStart();
	                  int end = txtArea.getSelectionEnd();
	                  cmd_mgr.invoke(new CopyCommand(buffer_mgr, begin, end));
	                  update();
	            }
			} //end of copy
			else if (choice.equals("paste")) {
	                  cmd_mgr.invoke(new PasteCommand(buffer_mgr, txtArea.getCaretPosition()));
	                  update();
			} //end of paste
			else if (choice.equals("delete")) {
				if(txtArea.getSelectedText() != null) {
	                  int begin = txtArea.getSelectionStart();
	                  int end = txtArea.getSelectionEnd();
	                  cmd_mgr.invoke(new DeleteCommand(buffer_mgr, begin, end));
	                  update();
	            }
			} //end of delete
			else if (choice.equals("undo")) {
	                  cmd_mgr.undo();
	                  update();
			} //end of undo
			else if (choice.equals("redo")) {
				  	cmd_mgr.redo();
				  	update();
			} //end of redo
			
		}//end of method
		
	}//end of listener
	
	class MyDocumentListener implements DocumentListener  {
		private NotepadGUI parent;
		
		public MyDocumentListener(NotepadGUI parent) {
			this.parent = parent;
		}
		
		@Override
		public void changedUpdate(DocumentEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void insertUpdate(DocumentEvent e) {
			try {
		     String text = txtArea.getText(e.getOffset(), e.getOffset() + e.getLength() );
		     cmd_mgr.invoke( new InsertCommand(buffer_mgr, text, e.getOffset()) );
			}
		    catch(Exception ex) {
		    	System.out.println(ex);
		    }
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
		     cmd_mgr.invoke( new DeleteCommand(buffer_mgr, e.getOffset(), e.getOffset() + e.getLength()) );			
		}

	}//end of listener

}


