package kuis_sem_4;
import java.util.*;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class LabQueue1 {

	public static void main(String[] args) {
		//create List
		Queue queue = new LinkedList();
		Scanner io = new Scanner(System.in);
		Stack stack=new Stack();
		String aim1,aim2,aim3,aim4,aim5;
		System.out.println("enter aim : ");
		aim1=io.nextLine();
		aim2=io.nextLine();
		aim3=io.nextLine();
		aim4=io.nextLine();
		aim5=io.nextLine();
		
		
		queue.add(aim1);
		queue.add(aim2);
		queue.add(aim3);
		queue.add(aim4);
		queue.add(aim5);
		
		System.out.println("List of my aim / wishes n 2020:\n"+queue+"\n");
		
		//remove 1st queue
		System.out.println("remove my first aim / wishes : "+queue.peek()+"\n");
		queue.remove();
		
		//listing new queue
		System.out.println("list of aim / wishes after first remove :\n"+queue+"\n");
		
		System.out.println("peek my first aim / wishes  : "+queue.peek()+"\n");
	
		System.out.println("poll my first aim / wishes  : "+queue.poll()+"\n");
		
		System.out.println("list of aim / wishes  after first poll : \n"+queue+"\n");
		
		//reverse order
		while(!queue.isEmpty()) {
			stack.add(queue.peek());
			queue.remove();
		}
		while(!stack.isEmpty()) {
			queue.add(stack.peek());
			stack.pop();
		}
		System.out.println("Lastly, list of my aim / wishes for 2020 in reverse order :\n"+queue);
		
		
	}

}
