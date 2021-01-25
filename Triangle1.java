package kuis_sem_3;

public class Triangle1 {

	double side1,side2,side3;
	
	Triangle1(){
		side1=1.0;
		side2=1.0;
		side3=1.0;
	}
	
	Triangle1(double newSide1,double newSide2,double newSide3){
		side1=newSide1;
		side2=newSide2;
		side3=newSide3;
	}
public double getPerimeter() {
	return side1 + side2 +side3;
}
	
	
	
}
