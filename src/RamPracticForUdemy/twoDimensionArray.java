package RamPracticForUdemy;

public class twoDimensionArray {

	public static void main(String[] args) {
		int [][]a = new int [10][10];
	for(int i=0;i<=a.length;i++) {
			for(int j=0;j<=a.length;j++) {
				int c=(int)(Math.random()*10);
				
				System.out.print("["+i+"]"+"["+j+"] = "+c);
			}
			System.out.println(" ");
		}
	}

}
