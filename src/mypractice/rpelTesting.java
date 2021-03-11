package mypractice;
import java.util.Scanner;
public class rpelTesting {
	
	
	  public static void main(String []args){
	   boolean isSunny;
	    int temperature;
	    System.out.println("Is it sunny outside?");
	    Scanner input = new Scanner(System.in);
	    isSunny=input.nextBoolean();
	    int num1 = input.nextInt();
	    if(isSunny==true){
	      System.out.println("What is the temperature outside?");
	      temperature=input.nextInt();
	      if(temperature>85){
	         System.out.println( "I am going to the beach");
	    
	      }else{
	         System.out.println("I am going to the park");


	      }
	}else{
	      System.out.println("I stay home and practice Java");
            input.close();
	    }

	  }

	}


