package OOP;

import java.lang.reflect.Array;
import java.util.Scanner;

public class NewArr {

	public static void main(String[] args) {
		 int n=0, temp;
	        Scanner s = new Scanner(System.in);
	        Scanner c = new Scanner(System.in);
	        System.out.println("Choose Option :");
			System.out.println("1. Adition ");
			System.out.println("2. Multiplication ");
			System.out.println("3. Ascending Order ");
			System.out.println("4. Descending order ");
			int option = c.nextInt();
	        
			int a[] = new int[n];
			
			switch(option) {
			
			case 3: option=3;
			System.out.print("Enter no. of elements you want in array:");
	        n = s.nextInt();
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) 
	        {
	            a[i] = s.nextInt();
	        }
	        for (int i = 0; i < n; i++) 
	        {
	            for (int j = i + 1; j < n; j++) 
	            {
	                if (a[i] > a[j]) 
	                {
	                    temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }
	        System.out.print("Ascending Order:");
	        for (int i = 0; i < n - 1; i++) 
	        {
	            System.out.print(a[i] + ",");
	        }
	        System.out.print(a[n - 1]);
		
	}
				
	}
	
}
     


	


