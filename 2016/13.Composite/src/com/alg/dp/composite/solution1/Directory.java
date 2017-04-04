package com.alg.dp.composite.solution1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Directory {
	private String name;
	private Date date;
	private List<File> files;
	private List<Directory> subdirs;
	
	public Directory(String name, Date date) {
		this.name = name;
		this.date = date;
		files = new ArrayList<File>();
		subdirs = new ArrayList<Directory>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void addFile(File file) {
		files.add(file);
	}
	
	public void removeFile(File file) {
		files.remove(file);
	}
	
	public void addDirectory(Directory directory) {
		subdirs.add(directory);
	}
	
	public void removeDirectory(Directory directory) {
		subdirs.remove(directory);
	}

	public File getChild(int i) {
		return files.get(i);
	}
	public int cumulativeSize() {
		int total = 0;
		for(int i = 0; i < files.size(); ++i)
			total += files.get(i).getSize();
		for(int i = 0; i < subdirs.size(); ++i)
			total += subdirs.get(i).cumulativeSize();
		return total;
	}
	public void print() {
		
	}
}
