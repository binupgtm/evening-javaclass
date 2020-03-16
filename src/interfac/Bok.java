package interfac;

public class Bok implements Bank {
	
	@Override
	public String getBankName(){
		return "Bok";
	}

	@Override
	public int getRate() {
		return 4;
	}

}
