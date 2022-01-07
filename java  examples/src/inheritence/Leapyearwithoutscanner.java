package inheritence;

public class Leapyearwithoutscanner {
	public static void main(String[] args) {
		int year=2200;
		if(year%400==0)
		{
			System.out.println("its a leap year");
		}
		else if(year%4==0 && year%100!=0){
			System.out.println("its a leap year");
		}
		else{
			System.out.println("not a leap year");
		}
	}

}
