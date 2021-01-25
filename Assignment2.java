package kuis_sem_2;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double [][] sales 	= new double [5][5];
		double [][] total1  = new double [1][5];
		double [] total2  = new double [5];
 		int salesperson=0;
		System.out.println("Enter salesperson: ");
		salesperson=input.nextInt();
		while (salesperson!=-1) {
			System.out.println("Enter product number: ");
			int product=input.nextInt();	
			product-=1;
			System.out.println("Enter sales amount: ");
			int value=input.nextInt();
			sales[product][salesperson]=value;
			System.out.println("Enter salesperson: ");
			salesperson=input.nextInt();
		}
		for(int row=0;row<sales.length;row++) {
			int total=0;
			for (int column=0;column<sales[row].length;column++) {
				total+=sales[column][row];
				sales[column][0]=column+1;			
			}
			
			if (row>=total1.length) {
				total1[0][row]=total;	
			}
			else {
				total1[0][row+1]=total;
			}		
		}
		for(int column=0;column<sales[0].length;column++) {
			int total=0;
			for (int row=1;row<sales.length;row++) {
				total+=sales[column][row];
				total2[column]=total;	
			}				
		}
		System.out.println(" product " + "|" +" " + " salesperson1 "+"|"+" "+" salesperson2 "+"|"+" "+"salesperson3 "+"|"+" "+" salesperson4 "+"|"+" "+"\tTotal");
		for (int y =0;y<90;y++) 
		System.out.print("-");
		System.out.println();
		for(int row=0;row<sales.length;row++) {
		for (int column=0;column<sales[row].length;column++) {		 
		System.out.print(" "+sales[row][column] +"\t\t");
		}
		System.out.print(total2[row]);
		System.out.println();
		}
		System.out.print("total\t\t ");
	for(int row=1;row<total1[0].length;row++) {
		System.out.print(total1[0][row]+"\t\t ");
		}
	}		
 }	

