package Multithreading;

public class Test {

	public static void main(String[] args) {
		System.out.println("before sleep");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after sleep:");

	}

}
