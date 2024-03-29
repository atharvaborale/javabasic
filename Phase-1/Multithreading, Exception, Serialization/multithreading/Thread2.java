package multithreading;

public class Thread2 implements Runnable{

	
	//implement run method
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
			//created 2 target of runnable interface
			Thread2 ins1= new Thread2();
			Thread2 ins2= new Thread2();
			
			//created 2 threads by passing 2 ruunable targets in constructor
			Thread t1=new Thread(ins1);
			Thread t2= new Thread(ins2);
			
			t1.setName("first");
			t2.setName("second");
			
			t1.start();
			t2.start();
		}

}
