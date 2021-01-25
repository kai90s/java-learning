package kuis_sem_1;
import java.util.*;
public class MassAir {

	public static void main(String[] args) {
		
		Scanner io= new Scanner(System.in);  
		 
        
		float mass,psi,volume,temperature;
 
           
 
             
        System.out.println("Mass of Air Code ");
        System.out.println("====================");
		System.out.println("please enter psi of tire : ");
     
         		psi=io.nextFloat();
  
	      
		System.out.println("please enter a volume of tire : ");
 
	        	volume=io.nextFloat();
            
		
		System.out.println("please enter the temperature of tire : ");
  
       			temperature=io.nextFloat();	
		
			mass=(psi*volume)/(0.36f*(temperature+460));

			
		System.out.println("the mass of air  is = "+mass);

	}

}
