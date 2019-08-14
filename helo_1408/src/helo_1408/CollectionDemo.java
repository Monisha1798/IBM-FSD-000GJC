package helo_1408;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CollectionDemo {

	static Scanner sc=new Scanner(System.in);
	private String str[];
	private Set<String> set;
	public CollectionDemo() throws InputMismatchException
	{
		System.out.print("Number of elements in the Array: ");
		str=new String[sc.nextInt()];
		for(int i=0;i<str.length;i++)
		{
			System.out.println("Name:");
			str[i]=sc.next().toString();
		}
		set=new HashSet();
		for(String s:str)
		{
			if(!set.add(s))
			{
				System.out.println("Duplicate element found not added in set -- "+s);
			}
		}
	}
	public void displayCollection()
	{
		for(String ss:set)
		{
			System.out.println(ss.toString().toLowerCase());
		}
		
		/*Iterator<String> i=set.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next().toString());
		}*/
	}
}
