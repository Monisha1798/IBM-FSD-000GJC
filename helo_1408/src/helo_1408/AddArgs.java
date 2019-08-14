package helo_1408;

public class AddArgs {
	public static void main(String args[])
	{
		int sum=0;
		for(String a:args)
		{
			try
			{

				System.out.println(args[10]);
				sum+=Integer.parseInt(a);
				try {
					
				}
				finally {
					
				}
			}
			
			catch(NumberFormatException nfe)
			{
				//System.err.println("number format");//if out.println number format will be displayed in b
				//nfe.printStackTrace();
				//System.err.println(nfe.getCause().toString());
				System.err.println(nfe.getMessage());
				
				System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException aeobe)
			{
				System.err.println("Array Index Out of bound Exception");
			}
			
			/*catch(Exception e)
			{
				System.err.println("Exception occured");
				//System.exit(0);
			}*/
			finally {
				System.out.println("Finally block executed");
			}
		}
		System.out.println("Sum: "+sum);
	}
}
