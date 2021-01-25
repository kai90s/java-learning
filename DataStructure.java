package kuis_sem_4;
import java.util.Scanner;
public class DataStructure {
	static Scanner s=new Scanner(System.in);
	static int count[]=new int [15];
	static int temp = 0;
	

public static void user() {
	System.out.print("Enter All Elements: ");
	for(int i=0;i<count.length;i++) {
		count[i]=s.nextInt();
		
	}
}

public static void addition() {
	for (int i = 0; i < count.length; i++) {
	temp+=count[i];
	     }
	System.out.println("Total Summation Of Array: "+temp);
	}
public static void substraction() {
	temp=count [0];   
	for (int i = 1; i < count.length; i++) {
	temp-=count[i];
	}
	System.out.print("Total Substraction Of array: "+temp);

	}
public static void multiplication() {
	for (int i = 0; i < count.length; i++) {

	            temp=count[i];
	            temp*=5;
	            count[i]=temp;
	        }
	System.out.print("\nmultiply array: ");
	for (int i = 0; i < count.length - 1; i++)
	     {
	         System.out.print(count[i] + ", ");
	     }
	     System.out.print(count[count.length - 1]);
	}
public static void ascending() {
	for (int i = 0; i < count.length; i++) {

	            for (int j = i+1 ; j < count.length; j++) {
	               
	            if (count[i] > count[j]){
	           
	                    temp = count[i];
	                    count[i] = count[j];
	                    count[j] = temp;
	                }
	           
	            }
	        }

	        System.out.print("Array Elements in Ascending Order: ");
	        for (int i = 0; i < count.length - 1; i++)
	        {
	            System.out.print(count[i] + ", ");
	        }
	        System.out.print(count[count.length - 1]);    
	            }
public static void descending() {
	for (int i = 0; i < count.length; i++) {

	            for (int j = i+1 ; j < count.length; j++) {
	               
	            if (count[i] < count[j]){
	           
	                    temp = count[i];
	                    count[i] = count[j];
	                    count[j] = temp;
	                }
	            }
	        }
	        System.out.print("\nArray Elements in Descending Order: ");
	        for (int i = 0; i < count.length - 1; i++){
	    System.out.print(count[i] + ", ");
	    }
	System.out.print(count[count.length - 1]);
	}
public static void ListofProgram() {
	
	System.out.println("\n1.Addition");
	System.out.println("\n2.Substraction");
	System.out.println("\n3.Multiplication");
	System.out.println("\n4.Ascending order");
	System.out.println("\n5.Descending order");
	System.out.println("\n6.Exit");
	
	Scanner io =new Scanner(System.in);
	String repeat="Y";
	
	while(repeat=="Y"){

	System.out.print("\nChoose from the list above that you want to use: ");
	int choose =io.nextInt();
	switch(choose) {
	case 1:addition();
	break;
	case 2:substraction() ;
	break;
	case 3:multiplication();
	break;
	case 4:ascending();
	break;
	case 5: descending();
	break;
	case 6: repeat="N";
	break;
	default:
	System.out.println("Wrong Input");
	}
	if(repeat.equalsIgnoreCase("Y")) {

	System.out.print("\nContinue? (Y/N)");
	repeat=io.next();
	if(!repeat.equalsIgnoreCase("Y"))
	continue;
	else
	ListofProgram();
		}
	}
}
	public static void main(String[] args) {
		user();
		
		ListofProgram();
		System.out.println(" Thank You! ");
	}
}
	
