package com.sample.test;

import java.io.IOException;

import org.junit.Test;

import com.sample.shared.HandleFiles;

public class FileHandle {

    private String filePath="src/test/resources/File/File.txt";
	HandleFiles fie = new HandleFiles();

	@Test
	public void readfile() throws IOException {
		fie.readFile(filePath);
	}
	@Test
	public void doesFileExs(){
		System.out.println(fie.doesFileExist(filePath));
	}
}
