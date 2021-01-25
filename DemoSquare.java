package kuis_sem_3;

public class DemoSquare {public static void main(String[] args) {
Square Square = new Square(5,8);
Cube Cube =new Cube(3,5,6);
System.out.println("Square"+" "+"Height : "+Square.getheight()+" "+" Width : "+Square.getwidth()+" "+" SurfaceArea : "+Square.computesurfaceArea());	
System.out.println("Cube"+" "+"Height : "+Cube.getheight()+" "+" Width : "+Cube.getwidth()+" "+" Depth : "+Cube.getdepth()+" "+" is : "+Cube.computesurfaceArea());

	}
	

}
