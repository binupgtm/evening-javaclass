package Conditional;

public class ResultIfElse {

	public static void main(String[] args) {
		int english=56, math=70, science=65, nepali=70, social=80;
		int sumtotal=english+math+science+nepali+social;
		float percentage=(float)(sumtotal*100)/5;
	
		if(percentage>=80) {
			System.out.println("Distinction");
		}
		if(percentage>=6) {
			System.out.println("1st div");
		}
		if(percentage>=50) { 
			System.out.println("2st div");
		}
		if(percentage>=32) {
			System.out.println("3rd div");
		}
		else {
			System.out.println("fail");
		}
		

}
}
