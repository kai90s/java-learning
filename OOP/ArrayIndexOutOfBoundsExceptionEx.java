package kuis_sem_3;

public class ArrayIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		try {
			int a[]=new int[5];	
			a[6]=9;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is too much than its quantity");
		}
	}
}
