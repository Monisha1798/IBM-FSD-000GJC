package filereaderwriter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import java.io.IOException;

public class FileReaderWriter {
	public static void main(String[] args)throws IOException
	{
		FileInputStream in = new FileInputStream (new File("hel.txt"));
		FileOutputStream out = new FileOutputStream (new File("outt.txt"));
		int c;
		 while((c = in.read())!=-1)
		 {
			 System.out.println(c);
			 out.write(c);
		 }

in.close();
out.close();
	}
}
