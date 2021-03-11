package mypractice;

import java.util.Scanner;

public class MamKoCodeCopy {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your first number");
		int num1 = input.nextInt();
		System.out.println("Please enter your Second number");
		int num2 = input.nextInt();
		System.out.println("Please enter your Third number");
		int num3= input.nextInt();
		
		int result = 0;
		if(num1>num2) {
			if(num1>num3) {
				result =num1;
			}else {
				result =num3;
			}
		
	}else {
		if(num2>num3 ){
			result=num2;
		}

	}
	System.out.println("Here is the gretest among three "+ num1+" "+ num2 +" "+num3 + " is "+result );
}

}
