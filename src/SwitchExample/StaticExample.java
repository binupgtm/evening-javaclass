package SwitchExample;

public class StaticExample {
	static int a=10;
	
	void disply() {
		System.out.println("hi");
	}

	public static void main(String[] args) {
		StaticExample e=new StaticExample();
		System.out.println(a);
	    e.disply();
	}

}
