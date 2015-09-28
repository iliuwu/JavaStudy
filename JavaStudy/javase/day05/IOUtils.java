package day05;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.filechooser.FileNameExtensionFilter;

 class IOUtils01{
	public static void printHex(String fileName) throws IOException{
		FileInputStream in = new FileInputStream(fileName);
		int b; 
		while((b = in.read()) != -1){
			if (b<=0xf){
				System.out.println("0");
				
			}
			System.out.print(Integer.toHexString(b) + " ");
		}
		in.close();
	}
}
 class IOUtils02{
	public static void printHex(String filename) throws IOException {
		FileInputStream in = new FileInputStream(filename);
		int b;
		System.out.println("String filename:");
		while((b= in.read()) != -1){
			if (b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + " ");
		}
		in.close();
	
	}
	
	public static void printHex(File file) throws IOException {
		FileInputStream in = new FileInputStream(file);
		int b;
		System.out.println("File file:");
		while((b= in.read()) != -1){
			if (b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + " ");
		}
		in.close();
	}
	
	public static void printHex(InputStream in) throws IOException {
		int b;
		System.out.println("InputStream in:");
		while((b= in.read()) != -1){
			if (b<=0xf){
				System.out.print("0");
			}
			System.out.print(Integer.toHexString(b) + " ");
		}
		in.close();
	}
	 
 }
