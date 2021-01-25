package kuis_sem_2;
import java.util.Scanner;
public class Labtest2 {

	public static void main(String[] args) {
		int floor,bedroom;
		Scanner in=new Scanner(System.in);
		
		int [][] price  = {{400,450,510},
						{500,560,630},
						{625,676,740},
						{1000,1250,1600}};
		
		System.out.println("Enter a floor Number:");
		int Floor =in.nextInt();
		System.out.println("Enter Number Of Bedroom:");
		int Bedroom = in.nextInt();
		
		
		System.out.println("The rent for "+ Bedroom + " Bedroom apartment is RM "+price[Floor][Bedroom]);
				
			
		}
		
		

	}



