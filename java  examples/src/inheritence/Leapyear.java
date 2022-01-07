package inheritence;

import java.util.Scanner;

public class Leapyear {
public static void main(String[] args) {
	int year;
	System.out.println("Enter an year:: ");
	Scanner sc =new  Scanner(System.in); //system.in is used to take input inside 
	year=sc.nextInt(); //year is a reference variable nextint is used to take input whatever we given
	if(((year % 4== 0) && (year %100!= 0)) || (year%400 == 0))
		System.out.println("specified year is a leap year");
	else
	System.out.println("specified year is not a leap year");
			

}
}
