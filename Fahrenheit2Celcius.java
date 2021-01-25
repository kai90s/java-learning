package kuis_sem_1;
import java.util.*;
public class Fahrenheit2Celcius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner io=new Scanner(System.in);
		
		float celcius, fahrenheit;
	  
			System.out.println(" This Is A Program To Change fahrenheit To Celcius");
			System.out.println("==================================================");
	  			
			System.out.println("Enter A Number In Fahrenheit : ");

				fahrenheit=io.nextFloat();

		// fahr = 100;
	  
	 
	  	 celcius= (5.0f/9.0f)*(fahrenheit-32.0f);
	 
			System.out.println("You Enter A Number : "+fahrenheit );
	  
				System.out.println("The Result Is = " + celcius);
	 
	}

}
