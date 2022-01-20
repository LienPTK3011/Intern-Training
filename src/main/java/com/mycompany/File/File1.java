/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.File;

/**
 *
 * @author Dang
 */
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class File1 {
	
	public static void append2File(Path f1, Path f2) throws IOException {
		String str = "";
		BufferedReader br1 = null;
		try {
			br1 = new BufferedReader(Files.newBufferedReader(f1));
			String line1 = null;
			int i=0;
			while((line1 = br1.readLine()) != null) {
				str+=line1+"\n";
			}
		} finally {
			if(br1!=null) {
				br1.close();
			}
		}
		
		BufferedReader br2 = null;
		try {
			br2 = new BufferedReader(Files.newBufferedReader(f2));
			String line2 = null;
			int i=0;
			while((line2 = br2.readLine()) != null) {
				str+=line2+"\n";
			}
		} finally {
			if(br2!=null) {
				br2.close();
			}
		}
		
		Path fileTong = Paths.get("E://Java//Training//Intern-Training//src//main//java//com//mycompany//File//data//txt1+2.txt");
		byte[] data = str.getBytes();
		OutputStream os = null;
		try {
			os = new BufferedOutputStream(Files.newOutputStream(fileTong
					, StandardOpenOption.CREATE, StandardOpenOption.APPEND));
			os.write(data, 0, data.length);
		} finally {
			if(os!=null) {
				os.close();
			}
		}
	}
	
	
	public static void read3LineFirst(Path f) throws IOException {
		BufferedReader br = null;
		try {
			br = new BufferedReader(Files.newBufferedReader(f));
			String line = null;
			int i=0;
			while((line = br.readLine()) != null) {
				System.out.println(line);
				i++;
				if(i==3) {
					break;
				}
			}
		} finally {
			if(br!=null) {
				br.close();
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		Path file1 = Paths.get("E://Java//Training//Intern-Training//src//main//java//com//mycompany//File//data//txt1.txt");
		Path file2 = Paths.get("E://Java//Training//Intern-Training//src//main//java//com//mycompany//File//data//txt2.txt");
		append2File(file1, file2);
		
		Path file = Paths.get("E://Java//Training//Intern-Training//src//main//java//com//mycompany//File//data//text.txt");
		read3LineFirst(file); //
	}
}