package kuis_sem_3;

public class Book {
	 private String title;
	private int numberOfPages;
	
	Book(String newtitle, int newnumberOfPages){
		title = newtitle;
		numberOfPages = newnumberOfPages;
		
	}
public String gettitle() {
	return title;
}
public int getnumberOfPages() {
	return numberOfPages;
}
public String settitle(String newtitle) {
	return newtitle = title;
}
public int setnumberOfPages(int newnumberOfPages) {
	return newnumberOfPages = numberOfPages;
}
}
