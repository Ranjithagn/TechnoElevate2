package inheritence;

import java.util.Scanner;

public class Quadraticequation {

	public static void main(String[] args) {
	      Scanner scanner=new Scanner(System.in);
	      System.out.print("Enter the values of a,b and c: ");
	      double a=scanner.nextDouble();
	      double b=scanner.nextDouble();
	      double c=scanner.nextDouble();
	      double discriminant=Math.pow(b,2.0)-4*a*c;
	      if(discriminant>0) {
	    	  double root1=(-b+Math.sqrt(discriminant))/(2*a);
	    	  double root2=(-b-Math.sqrt(discriminant))/(2*a);
	    	  System.out.println("Root are " + root1 + " and "+root2);
	      }
	      else if(discriminant==0) {
	    	  double root=-b/(2*a);
	    	  System.out.println("Roots are " + root +" and " + root);
	      }
	      else{
	    	  double realpart = -b/(2*a);
	    	  double imgPart = Math.sqrt(-discriminant)/(2*a);
	    	  System.out.println(" Roots are " + realpart + " + "+ imgPart +"i" + " and " + realpart + " - " + imgPart + "i");
	      }
	      
	      

	}

}
