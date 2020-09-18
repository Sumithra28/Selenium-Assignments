package week1.day1.classroom;

public class OddNumbers {

	public static void main(String[] args) {

		int a = 2;

		System.out.println("Printing the odd numbers from 1 to 20");

		for (int i = 1; i <= 20; i++) {

			if ((i % a) == 1) {
				System.out.println(i);
			}
		}

	}

}
