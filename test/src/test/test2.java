package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class test2 {

	public static void main(String arg[])
	{
		try{
		Scanner sc= new Scanner(new File("javaClass\\team.txt"));
		String line;
		while(sc.hasNext())
			{
			line =sc.nextLine();
			System.out.println(line);
			}
		sc.close();
		}
		catch(FileNotFoundException e){
			System.out.println("Error Found");
		}
	}
}
