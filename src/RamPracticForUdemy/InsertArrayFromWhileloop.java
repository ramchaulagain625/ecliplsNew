package RamPracticForUdemy;

public class InsertArrayFromWhileloop {

	public static void main(String[] args) {
		int [] array = new int[10];
		int n =array.length;
		
		for(int i=0;i<n;i++) {
			int a = (int)(Math.random()*10);
			
              System.out.println("Array ["+i+"]"+" = "+a);
		}
		
	}

}
