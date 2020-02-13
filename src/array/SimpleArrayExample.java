package array;

public class SimpleArrayExample {

	public static void main(String[] args) {
//		String [] students=new String[5];
//		students= {"ram" , "hari"};
		String [] students= {"ram","hari","sita","gita","bimal"};
//		System.out.println(students.length);
		for(int x=0;x<students.length;x++) {
			System.out.println(students[x]);
		}
		students[0]="xyz";

	}

}
