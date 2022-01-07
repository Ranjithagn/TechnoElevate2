package inheritence;

import java.util.Scanner;

public class Calculator1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("input value for a ");
        double a=sc.nextDouble();
    	System.out.println("input value for b ");
		double b=sc.nextDouble();
		System.out.println("select the operations to be perfect");
		System.out.println("1.+");
		System.out.println("2.-");
		System.out.println("3.*");
		System.out.println("4./");
		System.out.println("5.perform all");
		int n=sc.nextInt();
		if(n==1) {
			double c=a+b;
			System.out.println("sum="+c);
		} else if(n==2){
			double c=a-b;
			System.out.println("dif="+c);
		}else if(n==3){
			double c=a*b;
			System.out.println("mul="+c);
		}else if(n==4){
			double c=a/b;
			System.out.println("div="+c);
		}
		else if(n==5){
			double c=a+b;
			double c1=a-b;
			double c2=a*b;
			double c3=a/b;
			System.out.println("sum="+c);
			System.out.println("diff="+c1);
			System.out.println("mul="+c2);
			System.out.println("div="+c3);
		}
	}
}

	
