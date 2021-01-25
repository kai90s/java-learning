package kuis_sem_4;
import java.util.*;
public class datStruc {

	public static void main(String[] args) {
		Scanner io=new Scanner(System.in);
		System.out.println(" With Great Power Comes Great Responsibility ");
		
		Stack stack =new Stack();
		Stack stack2=new Stack();
		String word= "MICKEY MOUSE";
		int i=0;
		while(i<word.length()) {
		stack.push(word.charAt(i));
		i++;
		}
		while(!(stack.empty())) {
		System.out.println(" "+stack.pop());
		}
		System.out.println("Enter car name : ");
		String car = io.nextLine();
		for(i=0;i<car.length();i++) {
			stack2.push(car.charAt(i));
		}
		while(!(stack2.empty())) {
			System.out.println(stack2.pop());
		}
	}
}
	
	
	

