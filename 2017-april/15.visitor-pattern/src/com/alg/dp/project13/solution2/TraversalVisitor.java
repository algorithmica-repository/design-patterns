package com.alg.dp.project13.solution2;

public class TraversalVisitor implements IVisitor {

	@Override
	public void visit(File file) {
			System.out.println(file);		
	}

	@Override
	public void visit(Directory directory) {
		System.out.println(directory);
		for(int i = 0; i < directory.getNumberOfChildren(); ++i) {
			Node node = directory.getChild(i);
			if(node instanceof File)
				visit((File)node);
			else
				visit((Directory)node);
		}
		
	}

}
