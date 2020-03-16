import java.util.Arrays;

public class SplitExample {

	public static void main(String[] args) {
		String names= "ram,shyam,hari";
		String split [] = names.split(" ", 0);
		for(String names1:split)
		System.out.println(names1);
	

	}

}
