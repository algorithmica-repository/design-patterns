package com.alg.dp.project12.solution1;

public class File {
	private String name;
	private Directory parent;
	
	public File(Directory parent, String name) {
		super();
		this.name = name;
		this.parent = parent;
		parent.add(this);
	}

	@Override
	public String toString() {
		return "File [name=" + name + ", parent=" + parent + "]";
	}

	public String getName() {
		return name;
	}	
	
	/*public String getAbsolutePath() {
		
	}*/

}
