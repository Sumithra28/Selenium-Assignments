package week1.day1.classroom;

/**
 * 
 * @author 266711
 *
 */
public class Factorial {

	public static void main(String[] args) {
		int fact = 5;
		int value = 1;
		
		for (int i = 1; i <= fact; i++){
			System.out.println("Before :: " + value);		
			value = i * value;
			System.out.println("After :: " + value);
		}
	}

}
