package mypractice;

import java.util.Scanner;

public class booleanB {
	public static void main(String[]args){
	    System.out.println("Input the boolean value");
	    Scanner sc = new Scanner(System.in);
	   boolean b=sc.hasNext("true");
	    boolean c=true;
	  
	    if(b==c){
	      System.out.print("The value is true");

	    }else{
	      System.out.print("The value is false");
	    }
	  }

}
