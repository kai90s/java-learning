package kuis_sem_2;
import java.util.Scanner;
public class Exercise1 {
	/**main method*/
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int multiply;
	System.out.print(" Enter first number ");
	int num1 = in.nextInt();
	System.out.print(" Enter second number ");
	int num2 = in.nextInt();
	
	multiply = num1 * num2;
	System.out.println(" The multiply of two number is "+multiply);
}

		public static int multiply(int x, int y){
		int result = x * y;
		return result;
	}
}
	

