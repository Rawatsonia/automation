// Write a program to show list of all file names in a folder.
package com.wbl.string;

import java.io.File;

public class ShowFolder {
	public void FilesInFolder()
	{
		File file = new File("C:/Users/sonia/workspace/Practice/src/com/wbl/prac");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
	}

	public static void main(String[] args) 
	{
		ShowFolder S = new ShowFolder();
		S.FilesInFolder();

	}

}
