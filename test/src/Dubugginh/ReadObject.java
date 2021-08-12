package Dubugginh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileInputStream Fi = new FileInputStream("javaClass\\Vehicle.dat"))
		{
			try(ObjectInputStream obj = new ObjectInputStream(Fi))
			{
				Vehicle v1 = (Vehicle) obj.readObject();
				Vehicle v2 = (Vehicle) obj.readObject();
				System.out.println("Object :"+v1);
				System.out.println("Object :"+v2);
				
			}catch(ClassNotFoundException e)
			{
				e.printStackTrace();
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
