package jdbc_20_08.thread;

public class MyThreadDemo1 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int j=0;j<20;j++)
		{
			if(j==10)
			{
				try{
				Thread.sleep(2000);
				}catch(Exception e)
				{
					
				}
			}
			System.out.println("j="+j);
		}
	}

	
}
