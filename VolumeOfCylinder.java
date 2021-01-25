package kuis_sem_1;
import java.util.*;
public class VolumeOfCylinder {

	public static void main(String[] args) {
		
		Scanner io= new Scanner(System.in);  
        
	     
	       float Pie=3.14f;
	     
	       float height,radius,volume,area;
	       
		radius=10;
	            
		height=10;
	 
	             float f= Pie*4;
	     
	       
	        System.out.println("Sphere volume Code ");
	        System.out.println("==================");
	     	
		System.out.println("please enter height cylinder : ");
	    
			height=io.nextFloat();
	  
	     	System.out.println("please enter a radius of cylinder : ");
	      
	        	radius=io.nextFloat();
	    
	          
		    area=Pie*radius*radius;
	      
	         // v= Pie*r*r*h;
	 
	            volume= f*radius*radius*radius/3;

			System.out.println("the volume of the cylinder is = "+volume);
	                
			System.out.println("the area of the cylinder is = "+area);


	}

}
