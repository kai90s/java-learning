package OOP;

public class TextBook extends Book{
	
	private int grade;
	
	TextBook (String title, int numberOfPages, int newgrade){
		super(title,numberOfPages);
		grade = newgrade;
	}
	

public int getgrade() {
	return grade;
}

public int setgrade(int newgrade) {
	return newgrade = grade;
}



}

