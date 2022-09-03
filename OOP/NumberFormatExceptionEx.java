package OOP;

public class NumberFormatExceptionEx {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("XYZ");
			System.out.println(num);
		}catch( NumberFormatException e) {
			System.out.println("You Did Not Entered The True Format");
		}
	}
}
