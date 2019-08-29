package filereaderwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileReader {
	
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException{
		
		FileReader in = new FileReader("input.txt");
		FileWriter out = new FileWriter("output.txt");
		BufferedReader inputStream = new BufferedReader(in);
		PrintWriter outStream = new PrintWriter(out);
		String l;
		while((l = inputStream.readLine())!=null)
		{
			System.out.println(l);
			outStream.println(l);
		}
		in.close();
		out.close();
	}

}
