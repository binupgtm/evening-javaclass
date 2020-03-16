package Multithreading;

public class ThreadDemoTest extends Thread {
	@Override
	public void run() {
		System.out.println("Thread is runing.");
	}

	public static void main(String[] args) {
		ThreadDemoTest td = new ThreadDemoTest();
		td.start();
		System.out.println("Thread Stopped.");

	}

}
