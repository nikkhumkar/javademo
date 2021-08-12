package test;

import java.io.File;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("javaClass\\team.txt");
		if(file.delete()){
			System.out.println("File Deleted Succesfful..!!!");
		}
		else{
			System.out.println("Error in File");
			
		}
	}

}
