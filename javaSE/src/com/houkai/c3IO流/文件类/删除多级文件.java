package com.houkai.c3IO流.文件类;

import java.io.File;

class DeleteFile{
	public void removeDir(File dir){
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++) {
			if(files[i].isDirectory()){
				removeDir(files[i]);
			}else{
				files[i].delete();
			}
		}
		boolean is = dir.delete();
		if(is){
			System.out.println("删除成功");
		}
	}
}

public class 删除多级文件 {
	public static void main(String[] args) {
		File dir = new File("F:\\aa");
		new DeleteFile().removeDir(dir);
	}
}
