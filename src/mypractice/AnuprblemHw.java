package mypractice;

import java.util.Scanner;

public class AnuprblemHw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		Scanner sc=new Scanner(System.in);
		  System.out.println("Please enter your mark");
		  int mark=sc.nextInt();
		 if(mark<0){
		    System.out.println("Please enter valid mark");
		    }else if(mark>=1 && mark<=25){
		      System.out.println("Your grade is F");
		    }else if(mark>25 && mark<=45){
		      System.out.println("Your grade is E");
		    }else if(mark>45 && mark<=50){
		      System.out.println("Your grade is D");
		    }else if(mark>50 && mark<=60){
		      System.out.println("Your grade is C");
		    }else if(mark>60 && mark<=80){
		      System.out.println("Your grade is B");
		    }else {
		      System.out.println("Your grade is A");
		    }

	}

}
