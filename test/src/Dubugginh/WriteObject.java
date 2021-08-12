package Dubugginh;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle bike = new Vehicle("Bike",123);
		Vehicle car = new Vehicle("car",12345);
		
		System.out.println(bike);
	
		try(FileOutputStream fos = new FileOutputStream("javaClass\\Vehicle.dat"))
		{
			try(ObjectOutputStream obj = new ObjectOutputStream(fos))
			{
				obj.writeObject(bike);
				obj.writeObject(car);
				System.out.println("File Created");
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
