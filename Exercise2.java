package kuis_sem_2;
import java.util.Scanner;
public class Exercise2 {
	
	public static void main(String[] args) {
	
		Scanner io = new Scanner (System.in);
		System.out.println("Enter Hour ");
		double jam = io.nextDouble();
		
		charge(jam);

	}

	public static void charge (double a) {
		
		double charge = 2;
		
		if (a >= 24) {
		charge = 10;
	}
		else if (a>3) {
			double remaining = a - 3;
			double remainingCharge= 0.50 * remaining;
			charge += remaining;
		}
		
		System.out.println("The Charge Is $" +charge);
		System.out.println( " Have A Good Day! ^_^");
}
}