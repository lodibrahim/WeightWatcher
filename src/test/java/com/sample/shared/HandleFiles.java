package com.sample.shared;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class HandleFiles {
	private String filePath="src/test/resources/File/File.txt";


	public boolean doesFileExist(String filePath){
		try {
			File f = new File(filePath);
			if(f.exists() && !f.isDirectory()) {
			   return true;
			}
			return false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	public void readFile(String filePath) throws IOException{
		BufferedReader br=null;
		FileReader fr=null;
		try {
			fr=new FileReader(filePath);
			br=new BufferedReader(fr);
			String scurrentLine;
			br=new BufferedReader(new FileReader(filePath));
			while((scurrentLine = br.readLine()) !=null){
				String replaced =scurrentLine.replaceAll("-", ",");
				String[] splt=replaced.split("\\,");
				for (int i=0; i<splt.length; i++){

					if (i==0){
						System.out.println("Word is : "+splt[i]);
						continue;
					}
					System.out.println("Meaning is : "+splt[i]);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
