package Multithreading;

public class ThreadClassExample extends Thread{
	@Override
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("Thread run");
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ThreadClassExample t=new ThreadClassExample();
		t.setName("ThreadClass");
		ThreadClassExample t1= new ThreadClassExample();
		
		t.start();
		t1.start();
		System.out.println("Thread main "+t.getName());

	}

}
