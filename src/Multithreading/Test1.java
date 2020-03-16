package Multithreading;

public class Test1 {

	public static void main(String[] args) {
		System.out.println("It's me before sleep");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("after sleep ");

	}

}
