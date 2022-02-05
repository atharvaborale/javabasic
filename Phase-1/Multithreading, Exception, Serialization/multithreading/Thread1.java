package multithreading;

public class Thread1 extends Thread {

	
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println(i+ " "+Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		Thread1 t1=new Thread1();
		Thread1 t2=new Thread1();
		
		t1.setName("first");
		t2.setName("Second");
		t1.start();
		t2.start();
	}
}
