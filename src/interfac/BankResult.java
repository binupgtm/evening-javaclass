package interfac;

public class BankResult {

	public static void main(String[] args) {
		Bok b=new Bok();
		b.getBankName();
		b.getRate();
		
	
		System.out.println("Bank name:"+" "+b.getBankName()+","+"Intrest Rate:"+" "+b.getRate());
	}
	

}
