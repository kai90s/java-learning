package kuis_sem_3;

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

