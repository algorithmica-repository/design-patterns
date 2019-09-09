package com.alg.oodesign.editor.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BufferManager {	
	private StringBuffer buffer;
	
	public BufferManager() {
		buffer = new StringBuffer("");
	}
	
	public void open(File file) {
		try {
			//  Read everything from file until the end-anchor is found: \Z
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("\\Z");
            
            String file_content = "";
            while (scanner.hasNext()) 
                file_content += scanner.next();
            buffer.append(file_content);
            scanner.close();
            System.out.println("open" + buffer);

        } catch (FileNotFoundException fnfe) {
                System.out.println("This error was thrown: " + fnfe);
        }   
	}
	
	public void save(File file) {
		try {
            PrintWriter writer = new PrintWriter(file);
            writer.write(buffer.toString());
            writer.close();
        } catch (IOException ioe) {
            System.out.println("This error was thrown: " + ioe);
        }
	}
	
	public void insert(String text, int pos) {
		buffer.insert(pos, text);
	}
	
	public String delete(int start, int end) {
		String tmp = buffer.substring(start, end);
		buffer.delete(start, end);
		return tmp;
	}
	
	public void cut(int start, int end) {
		String tmp = delete(start, end);
		Clipboard.getInstance().set(tmp);
		System.out.println("cut" + buffer);
	}
	
	public void paste(int pos) {
		String tmp = Clipboard.getInstance().get();
		insert(tmp, pos);
	}
	
	public void copy(int start, int end) {
		String tmp = buffer.substring(start, end).toString();
		Clipboard.getInstance().set(tmp);
	}

	@Override
	public String toString() {
		return "Editor [buffer=" + buffer + "]";
	}	
	
	public String getBufferContent() {
		return buffer.toString();
	}

}
