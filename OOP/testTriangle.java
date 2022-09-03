package OOP;

public class testTriangle {

	public static void main(String[] args) {
		
		Triangle1 myTriangle = new Triangle1(4,5,6);
		
		System.out.println("The perimeter of first triangle of side : " + myTriangle.side1 +" + "+ myTriangle.side2+" + "+myTriangle.side3 + " is =" +" "+ myTriangle.getPerimeter());

		
		Triangle1 yourTriangle = new Triangle1(1.5,2.5,3.5);
		
		System.out.println("The perimeter of second triangle of side : " + yourTriangle.side1 +" + "+ yourTriangle.side2+" + "+yourTriangle.side3 + " is =" +" "+ yourTriangle.getPerimeter());
		

		
	}

}
