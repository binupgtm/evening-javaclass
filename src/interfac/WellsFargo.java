package interfac;

public class WellsFargo implements Bank {
	
	@Override
	public String getBankName() {
		return "WellsFargo";
	}

	@Override
	public int getRate() {
		return 3;
	}

}
