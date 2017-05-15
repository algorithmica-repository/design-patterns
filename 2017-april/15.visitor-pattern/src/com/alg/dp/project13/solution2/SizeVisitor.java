package com.alg.dp.project13.solution2;

public class SizeVisitor implements IVisitor {
	private int size;
	private int nfiles;
	private int ndirectories;

	public SizeVisitor() {
		size = 0;
		nfiles = 0;
		ndirectories = 0;
	}
	@Override
	public void visit(File file) {
		size += file.size();
	}

	@Override
	public void visit(Directory directory) {		
		for(int i = 0; i < directory.getNumberOfChildren(); ++i) {
			Node node = directory.getChild(i);
			if(node instanceof File) {
				++nfiles;
				visit((File)node);
			}
			else {
				++ndirectories;
				visit((Directory)node);
			}
		}
	}

	public void report() {
		System.out.println("number of files:" + nfiles);
		System.out.println("Number of subdirectories:" + ndirectories);
		System.out.println("Total size:" + size );
	}
}
