package filereaderwriter;

import java.io.*;

public class SimpleEncryption {
	 
	void encrypt(String source, String dest, int shiftSize)
	{
		BufferedReader reader;
		 BufferedWriter writer;
		 try {
			 reader = new BufferedReader(new FileReader(source));
			 writer = new BufferedWriter(new FileWriter(dest));
			 String line = reader.readLine();
			 int data;
			 int c=0;
			 while(line != null) {
				 for(int i=0; i < line.length();i++)
				 {
					  c = count(line);
					 data = (int)line.charAt(i)+shiftSize;
					 writer.write(data);
					 
				 }
				 writer.write((int)'\n');
				 line = reader.readLine();
				 System.out.println("No.of.vowels: "+c);
			 }
			 reader.close();
			 writer.close();
			 
		 }catch(IOException ie)
		 {
			 System.out.println("Failed encrypting the file content");
		 }
	}
	
	public void viewFileContent(String filename)
	{
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(filename));
			String line = reader.readLine();
			while(line != null)
			{
				System.out.println(line);
				line = reader.readLine();
			}
			reader.close();
		}catch(IOException ie)
		{
			System.out.println("Failed to open file for reading ");
		}
	}
	public int count(String i)
	{
		int vowel=0;
		for(int j = 0; j < i.length(); ++j)
		{
		char ch = i.charAt(j);
        if(ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u') {
            ++vowel;
          }
        }
		return vowel;
	}
}
