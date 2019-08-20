package jdbc_20_08.thread;


public class MyThreadDemo implements Runnable{

	public static void main(String[] args)
	{
		MyThreadDemo myThread1=new MyThreadDemo();
		MyThreadDemo1 myThread2=new MyThreadDemo1();
		Thread t1=new Thread(myThread1);
		Thread t2=new Thread(myThread2);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();

		
		try {
			t1.join();
			
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}

		System.out.println(t2.isAlive());
 	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
		for(int i=0;i<20;i++)
		{
			System.out.println(">i:"+i);
			if(i==10)
			{
				Thread.yield();
				
			}
		}
	}catch(Exception e)
		{
		System.out.println("Thread Exception");
		}
		}
	
}
