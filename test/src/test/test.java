package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class test {

	public static void main(String[] args) throws InterruptedException {
		
		File file = new File("javaClass");
		file.mkdir();
		file = new File("javaClass\\team.txt");
		try {
			file.createNewFile();
			System.out.println("File created");
		} catch (IOException e) {
			System.out.println("Error occur");
			e.printStackTrace();
		}
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))){
			bw.write("Nikhil");
			bw.write("\t"+" khumkar");
			bw.newLine();
			bw.write("hello all "+"\n");
			bw.write("Writting on the file...!!!");
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error occur");
			e.printStackTrace();
		}
		try {
			BufferedReader br = new BufferedReader(new FileReader("javaClass\\team.txt"));
			String line;
			System.out.println("************");
			while((line = br.readLine())!=null){
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
