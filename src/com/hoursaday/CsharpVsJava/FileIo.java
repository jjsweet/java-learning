package com.hoursaday.CsharpVsJava;

import java.io.*;

public class FileIo {
	
	private static void readWrite() throws IOException {
		BufferedReader br = null;
		PrintWriter pw = null;
		
		try {
			br = new BufferedReader(new FileReader("C:\\Users\\nelsonj5\\Desktop\\test.txt"));
			pw = new PrintWriter(new FileWriter("C:\\Users\\nelsonj5\\Desktop\\test_out.txt"));
			
			String s;
			
			while ((s = br.readLine()) != null) {
				pw.println(s);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally { 
			
			if (br != null) br.close();
			if (pw != null) pw.close();
		}
	}

	public static void main(String[] args) {
		try {
			FileIo.readWrite();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
