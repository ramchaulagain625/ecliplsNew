package Review2;

import java.util.Objects;
import java.util.Scanner;

public class main123 {
	public static void main(String []args){
		double discount;
		char code = 'C';

		switch ( code ){
		case 'A':
		discount = 0.0;
		break;

		case 'B':
		discount = 0.1;
		break;
		case 'C':
		discount = 0.2;
		break;
		default:
		discount = 0.3;
		}
		System.out.println(discount);
	}
	
}
