package hello_1908;

import java.util.Set;
import java.util.TreeSet;

public class Main {
 public static void main(String[] args)
 {
	 Set<Student> set=new TreeSet<Student>();
	 set.add(new Student("A","B",4.5));
	 set.add(new Student("A","B",6.5));
	 set.add(new Student("A","B",5.5));
	 set.add(new Student("A","B",7.5));
	 Object[] obj=set.toArray();//array conversion
	 Student s=null;
	 for(Object o:obj)
	 {
		 s=(Student)o;
		 System.out.printf("Name: %s %s GPA: %.1f\n",s.getFirstName(),s.getLastName(),s.getGPA());
	 }
 }
}
