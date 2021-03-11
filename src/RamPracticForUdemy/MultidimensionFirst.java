package RamPracticForUdemy;

public class MultidimensionFirst {

	public static void main(String[] args) {
		int [][][] array = new int[4][4][2];
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				for(int k=0;k<2;k++) {
					int v=(int)(Math.random()*10);
					System.out.println("["+i+"] ["+j+"] ["+k+"] ="+v+"  ");
				}
				System.out.println();
			}
		}
	}

}
