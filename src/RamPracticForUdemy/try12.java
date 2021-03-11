package RamPracticForUdemy;

import java.util.Scanner;

public class try12 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,c;
		 System.out.println("Please enter first number ");
		    a=sc.nextInt();
		 System.out.println("Please enter second number ");
		    b=sc.nextInt();
		 System.out.println("Please enter third number ");
		    c=sc.nextInt();
	        if(a>b) {
		    	if(b>c) {
		    		System.out.println(a+" is the largest number");
		    	}
		   }else if(b>c) {
			     if(c>a) {
			    	 System.out.println(b+" is the largest number");
			     }
		   }else {
			   System.out.println(c+" is the largest number");
		   }
sc.close();
	}

}
