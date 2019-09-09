package com.alg.oodesign.editor.view;

import com.alg.oodesign.editor.model.CommandManager;
import com.alg.oodesign.editor.model.CopyCommand;
import com.alg.oodesign.editor.model.CutCommand;
import com.alg.oodesign.editor.model.BufferManager;
import com.alg.oodesign.editor.model.InsertCommand;
import com.alg.oodesign.editor.model.PasteCommand;

public class CommandLine {

	public static void main(String[] args) {
		BufferManager editor = new BufferManager();
		CommandManager	cmd_mgr = new CommandManager();
		
		cmd_mgr.invoke(new InsertCommand(editor, "abc", 0));	
		System.out.println(editor);
		cmd_mgr.invoke(new InsertCommand(editor, "def", 2));	
		System.out.println(editor);
		cmd_mgr.invoke(new InsertCommand(editor, "xyz", 0));	
		System.out.println(editor);	
		
		cmd_mgr.undo();
		System.out.println(editor);
		cmd_mgr.undo();
		System.out.println(editor);
		cmd_mgr.redo();
		System.out.println(editor);
		
		cmd_mgr.invoke(new CutCommand(editor, 2, 4));
		System.out.println(editor);
		cmd_mgr.invoke(new PasteCommand(editor, 0));
		System.out.println(editor);
		
		cmd_mgr.invoke(new CopyCommand(editor, 2, 4));
		System.out.println(editor);
		cmd_mgr.invoke(new PasteCommand(editor, 0));
		System.out.println(editor);
		
		cmd_mgr.undo();
		System.out.println(editor);
		cmd_mgr.undo();
		System.out.println(editor);
		cmd_mgr.redo();
		System.out.println(editor);

		
	}
	
}
