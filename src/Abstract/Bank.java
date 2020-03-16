package Abstract;

public abstract class Bank {
	
	public abstract String getBankName();
	
	abstract int getRate();
	
	public int serviceChargeRate=4;
	
	double getDollarExchangeRate() {
		return 102.5;
	}

} 
