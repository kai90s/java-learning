package FundamentalOfProgramming;
import java.util.Scanner;
public class lab_test {

	public static void main(String[] args) {
		
		Scanner io = new Scanner(System.in);

		System.out.println("input first number");
		int num1=io.nextInt();
		
		System.out.println("input second number");
		int num2=io.nextInt();
		
		System.out.println("input third number");
		int num3=io.nextInt();
		
		
		System.out.println(" Output is " + num1 +" "+ num2 +" "+num3);
		
		System.out.println(" Reverse are " + num3+" "+ num2 +" "+num1);


		
		int max;
		if (num1>num2)
			max = num1;
		else 
		 max = num2;
		if (max<num3)
			max=num3;
			System.out.println("max number is: " + max );
	
		
		int min = 0;
		if (num1<num2)
			min=num1;
		else 
			min=num2;
		if (min>num3)
			min=num3;
		
		System.out.println("min num is : " + min);
	}

}
