package com.alg.dp.composite.solution1;

import java.nio.file.Files;
import java.util.Date;

public class Driver {

	public static void main(String[] args) {
		FileSystem fileSystem = new FileSystem();
		Directory cdrive = new Directory("C", new Date());
		Directory ddrive = new Directory("D", new Date());
		
		Directory dp = new Directory("design", new Date());
		dp.addFile(new File("abc.txt", 100, new Date()));
		dp.addFile(new File("def.txt", 200, new Date()));
		cdrive.addDirectory(dp);
		
		ddrive.addFile(new File("pqr.txt", 400, new Date()));
		
		fileSystem.addDirectory(cdrive);
		fileSystem.addDirectory(ddrive);
		
		System.out.println(fileSystem.size());

	}

}
