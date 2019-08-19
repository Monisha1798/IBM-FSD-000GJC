package hello_1908;

import java.util.Set;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class VectorDemo {
	
	private Vector<String> vector;
	public VectorDemo()
	{
		vector=new Vector<String>();
		vector.add("abc");
		vector.add("xyz");
		Enumeration<String> e = vector.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
	}
}
