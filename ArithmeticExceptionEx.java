package kuis_sem_3;
import java.util.*;
public class ArithmeticExceptionEx{
	public static void main(String[] args) {
	Scanner io=new Scanner(System.in);
		try {
		int n1,n2,sum;
		System.out.println("Enter First Number");
		n1=io.nextInt();
		System.out.println("Enter Second Number");
		n2=io.nextInt();
		sum=n1/n2;
		System.out.println(" result of "+ n1 +" "+"/"+" "+ n2 +" is : "+sum);
		}catch(ArithmeticException e) {
		System.out.println(" You cannot Do That... ");
		}	
	}
}


	


