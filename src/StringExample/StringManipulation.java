package StringExample;

import java.util.StringTokenizer;

public class StringManipulation {

	public static void main(String[] args) {
//		char [] ch= {'j','a','v','a'};
//		String s =new String(ch);
//		System.out.println(s);
//		String s1=new String("Ram");
//		String s2="hari";
//		System.out.println(s2.charAt(1));
//		System.out.println(s1.replace('R', 'j'));
//		String name="ram";
//		String surname ="Gautam";
//		String fullname=name+" "+surname;
//		System.out.println(fullname);
//		
//		StringBuffer s=new StringBuffer();
//		StringBuffer s1 =new StringBuffer("ram is a boy");
//		StringBuffer s2 = new StringBuffer("and he is a smart in coding");
//		
//		System.out.println(s);
//		System.out.println(s1);
//		System.out.println(s2);
//		
//		s1.append(s2);
//		System.out.println(s1);
//		s1.append("!");
//		System.out.println(s1);
//		System.out.println(s1.reverse());
		
//		StringBuilder sb=new StringBuilder();
//		StringBuilder sb1=new StringBuilder("he is working"+ " ,");
//		StringBuilder sb2=new StringBuilder("he is a smart worker");
//		
//		System.out.println(sb);
//		System.out.println(sb1);
//		System.out.println(sb2);
//		
//		sb1.append(sb2);
//		System.out.println(sb1);

		
		StringTokenizer token=new StringTokenizer("ram,sita,gita,hari",",");
		System.out.println(token.countTokens());
		System.out.println(token.hashCode());
			
	}

}
