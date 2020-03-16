package Abstract;

public class AbstractResult {

	public static void main(String[] args) {
		Bok b= new Bok();
		printBankInfo(b.getBankName(),b.getRate(),b.serviceChargeRate);
		
		WellsFargo wf=new WellsFargo();
		printBankInfo(wf.getBankName(),wf.getRate(),wf.serviceChargeRate);
		
		Discover d=new Discover();
		printBankInfo(d.getBankName(),d.getRate(),d.serviceChargeRate);
		
	}

	private static void printBankInfo(String bankName, int bankRate, int serviceChargeRate) {
		System.out.println("Bank name:"+bankName+","+"bank Rate:"+bankRate+","+"service Charge Rate:"+serviceChargeRate);
		
	}

}
