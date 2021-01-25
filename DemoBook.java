package kuis_sem_3;

public class DemoBook {

	public static void main(String[] args) {
		
		Book book1 = new Book("Harry Potter",200);
		TextBook TextBook = new TextBook(" Object-Oriented Programming ",300, 4);
		
		System.out.println(" name : "+book1.gettitle()+" | "+" pages : "+ book1.getnumberOfPages());
		System.out.println(" name : "+TextBook.gettitle()+" | "+" pages : "+ TextBook.getnumberOfPages()+" | "+" Grade : "+ TextBook.getgrade());

	}

}
