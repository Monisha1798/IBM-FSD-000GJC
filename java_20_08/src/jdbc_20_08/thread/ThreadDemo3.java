package jdbc_20_08.thread;

public class ThreadDemo3 extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}
	
	public static void main(String[] args)
	{
		ThreadDemo3 demo=new ThreadDemo3();
		demo.start();
	}

}
