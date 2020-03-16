package Multithreading;

public class RunnableInterfaceExample implements Runnable {

	public static void main(String[] args) {
		RunnableInterfaceExample run = new RunnableInterfaceExample();
		Thread t= new Thread(run);
		t.start();
		System.out.println("Thread main");

	}

	@Override
	public void run() {
		System.out.println("Thread is runing");
		
		
	}

}
