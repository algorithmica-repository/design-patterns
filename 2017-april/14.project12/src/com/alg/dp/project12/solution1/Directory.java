package com.alg.dp.project12.solution1;

import java.util.ArrayList;
import java.util.List;

public class Directory {
	private String name;
	private Directory parent;
	private List<File> files;
	private List<Directory> directories;
	
	public Directory(String name) {
		this(null,name);
	}

	public Directory(Directory parent, String name) {
		super();
		this.name = name;
		this.parent = parent;
		files = new ArrayList<File>();
		directories = new ArrayList<Directory>();
		if(parent != null)
			parent.add(this);
	}
	
	public void add(File file) {
		files.add(file);
	}
	
	public void add(Directory directory) {
		directories.add(directory);
	}
	
	/*private void auxtraverse(Directory currentdir) {
		for(File file: currentdir.files)
			System.out.println(file);
		for(Directory dir: currentdir.directories) {
			System.out.println(dir);
			auxtraverse(dir);
		}
	}*/
	
	public void traverse() {	
		for(File file: files)
			System.out.println(file);
		for(Directory dir: directories) {
			System.out.println(dir);
			dir.traverse();
		}
	}

	@Override
	public String toString() {
		return "Directory [name=" + name + "]";
	}
	
/*	private void auxfind(Directory currentdir, String pattern) {
		for(File file: currentdir.files) {
			if(file.getName().indexOf(pattern) != -1)
				System.out.println(file);
		}
		for(Directory dir: currentdir.directories) {
			auxfind(dir, pattern);
		}
	}*/
	public void find(String pattern) {
		//System.out.println("Find-" + name);
		for(File file: files) {
			if(file.getName().indexOf(pattern) != -1)
				System.out.println(file);
		}
		for(Directory dir: directories) {
			dir.find(pattern);
		}
	}

	public String getName() {
		return name;
	}
	
	
}
