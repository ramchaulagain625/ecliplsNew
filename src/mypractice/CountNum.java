package mypractice;

import java.util.Scanner;

public class CountNum {


	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//String str = scan.next();
		String str="12345";
		
		count(str);
		

}
	public static void count(String s) {
		char []ch = s.toCharArray();
		int letter =0, space =0 , num =0,other=0;
		for(int i=0;i<s.length();i++) {
			if(Character.isLetter(ch[i]))
				letter++;
			else if(Character.isDigit(ch[i]))
				num++;
			else if(Character.isSpace(ch[i]))
				space++;
			else
				other++;
			
		}
		System.out.println(s);
		System.out.println("There are "+letter+"letter");
		System.out.println("There are "+num+" number");
		System.out.println("There are "+space+ " spsces");
		System.out.println("There are "+other+" other character");
	}
	
}