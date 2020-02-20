package oopexample;

public class PrintThisKeyword {
	
	public void printThis() {
		System.out.println(this);
	}

	public static void main(String[] args) {
		PrintThisKeyword obj=new PrintThisKeyword();
		obj.printThis(); 

	}

}
