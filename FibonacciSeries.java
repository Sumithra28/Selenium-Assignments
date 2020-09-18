package week1.day1.classroom;

public class FibonacciSeries {

	public static void main(String[] args) {

		int range = 8;
		int firstNum = 0;
		int secNum = 1;
				
		for (int i = 0; i <= range; i++) {
			
			System.out.println(firstNum);
			
			int tmpFirstNum = secNum;
			secNum = firstNum + secNum;
			firstNum = tmpFirstNum;
					
		}
			

	}

}
