package inheritence;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);//using this we accept input from user
		System.out.println("calculator");
		System.out.println("Enter the operation code");
		System.out.println("operation      operation code");
		System.out.println("Addition       add");
		System.out.println("Subtraction    sub");
		System.out.println("Multiplication mul");
		System.out.println("Divison        div");
		System.out.println("Remainder      rem");
		System.out.println("GST            gst");
	String s=sc.next();
	System.out.println("Enter first number  /   amount");
	double n1=sc.nextDouble();
	System.out.println("Enter second number  /   GST Percentage");
	double n2=sc.nextDouble();
	double r;
	switch(s) {
	case "add":
		r=n1+n2;
		System.out.println("Result="+r);
		break;
	case "sub":
		r=n1-n2;
		System.out.println("Result="+r);
		break;
	case "mul":
		r=n1*n2;
		System.out.println("Result="+r);
		break;
	case "div":
		r=n1/n2;
		System.out.println("Result="+r);
		break;
	case "rem":
		r=n1%n2;
		System.out.println("Result="+r);
		break;
	case "gst":
		r=((n1*n2)/100)+n1;
		System.out.println("Total Amount= "+r);
		break;
	}
}

}


