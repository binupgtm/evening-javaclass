package MyTest;

public class CalculatePercentage {
	String name="Binup";
	static int [] marks={45,54,60,70};
	
	public void display(double percentage) {
		System.out.println(name+" "+"has scored"+" " + percentage + "%");
	}
	
	public double CalculatePercentage(int[] marks) {
		double total=0;
		for(int a:marks) {
			total+=a;
		}
		return total/ 5;
	}

	public static void main(String[] args) {
//		DateTime
		CalculatePercentage cp = new CalculatePercentage();
		cp.display(cp.CalculatePercentage(marks));
		
	}

}
