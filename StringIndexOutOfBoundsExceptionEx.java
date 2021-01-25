package kuis_sem_3;

public class StringIndexOutOfBoundsExceptionEx {

	public static void main(String[] args) {
		try {
			String str = "Number One";
			System.out.println(str.length());
		char c = str.charAt(0);
		c = str.charAt(40);
		System.out.println(c);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException...");
		}
	}

}
