package mypractice;

import java.util.Scanner;

public class NastealIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your age for qualify");
		boolean b = sc.hasNext();
		int age = sc.nextInt();
		if (age >= 60) {
			System.out.println("you are enable to create a senior account");
		}else if (age >= 20 && age < 60) {
				System.out.println("You can open cecking account");
			}else if (age < 20) {
				System.out.println("you are enable to create saving account ");
			}else {
				System.out.println("Thank you for choosing us");
			}

				
				

		
	}

}
