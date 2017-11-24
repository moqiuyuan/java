package com.houkai.c3IO流.文件类;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

class CreateFileList{
	public void fileToList(File dir,List<File> list){
		File[] file = dir.listFiles();
		for (File file2 : file) {
			if(file2.isDirectory()){
				fileToList(file2,list);
			}else{
				if(file2.getName().endsWith(".bmp")){
					list.add(file2);
				}
			}
		}
	}
	
	public void writerToTxt(List<File> list,String file){
		try{
			BufferedWriter bufw = new BufferedWriter(new FileWriter(file));
System.out.println(list.size());
			for (File file2 : list) {
				String path = file2.getAbsolutePath();
System.out.println(file2.toString());
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
			bufw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}

public class 创建文件列表清单 {
	public static void main(String[] args) {
		File dir = new File("F:\\ChinaNetYX");
		List<File> list = new ArrayList<File>();
		CreateFileList cfl = new CreateFileList();
		
		cfl.fileToList(dir, list);
		cfl.writerToTxt(list, new File("F:\\ba.txt").toString());
		
	}
}
