package hello_1908;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ListDemo {
	public static void main(String[] args)
	{
		//int arr[];
		//int ARR=10;
		Collection<String> list=new ArrayList<String>();
		list.add("John");
		list.add("Joe");
		Set<String> set=new HashSet<String>();
		set.add("hello");
		set.add("world");
		list.addAll(set);
		System.out.println(list);
		list.removeAll(set);
		System.out.println(list);
		list.clear();
		System.out.println(list.isEmpty());
		Iterator<String> str=list.iterator();
		while(str.hasNext())
		{
			list.remove(str.next());
		}
		
	}

}
