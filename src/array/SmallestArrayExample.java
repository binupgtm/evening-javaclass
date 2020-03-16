package array;

public class SmallestArrayExample {

	public static void main(String[] args) {
		int a []= new int [] {100,5,7,3,12,17,20,55};
		int small=a[0];
		
		for (int i=0; i<a.length;i++) {
			if(a[i]<small) {
				small=a[i];	
			
		}
						
	}
		System.out.println("the smallst among 10 number is:"+small);
	}
}
