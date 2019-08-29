package filereaderwriter;

import java.io.*;


public class ObjectInputStream {
	
	public static void main(String[] args)
	{
		Employee employee = new Employee("10","Bob",2000,"mumbai");
		System.out.println("Employee to write is: "+employee);
		try {
			FileOutputStream out = new FileOutputStream("employee.out");
			ObjectOutputStream oos = new ObjectOutputStream(out);
			oos.write(employee);
			oos.flush();
		}catch(Exception e)
		{
			System.out.println("Problem Serializing: "+e);
		}
		try {
			FileInputStream in = new FileInputStream("employee.out");
			ObjectInputStream ois =new ObjectInputStream(in);
			employee = (Employee)(ois.readObject());
		}catch(Exception e)
		{
			System.out.println("Problem Serializing"+e);
		}
		System.out.println("Employee read is :"+employee);
	}
}
