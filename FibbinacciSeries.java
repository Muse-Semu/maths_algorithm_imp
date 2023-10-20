package maths;

public class FibbinacciSeries {
	public static void main(String[] args) {
		fibbonnaci(100);
	}

	private static void fibbonnaci(int num) {
		int i=0,first = 0,second,fibb=1;
		while(fibb<num) {
			System.out.print(fibb+" ");
			second = fibb+first;
			first=fibb;
			fibb = second;
		} 
		
	}
}
