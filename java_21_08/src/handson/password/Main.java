package handson.password;

import java.util.Scanner;
public class Main {
	
	public static void main(String[] args)
	{
		String password;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the password");
		password=sc.next();
		UserMainCode user=new UserMainCode();
		if(user.checkPassword(password)==true)
		{
			System.out.println("Valid Password");
		}
		else
			System.out.println("Invalid Password");
	}

}
