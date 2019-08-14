package helo_1408;
import java.util.Scanner;

public class Tester {
	
	private static Scanner scanner=new Scanner(System.in);
	
	public static void main(String args[])
	{
		/*Account account=new Account();
		try {
			account.createNewAccount("SBI",1000);
		}
		catch(AccountNotValidException e)
		{
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}*/
		String firstName=null;
		String lastName=null;
		int i=0;
		
		Name name=new Name();
		try {
			
			name.createNewName(firstName,lastName);
		
		}
		catch(NameNotValidException e)
		{
			//e.printStackTrace();
			System.err.println(e.getMessage());
		}
	}

}
