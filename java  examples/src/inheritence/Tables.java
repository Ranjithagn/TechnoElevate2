package inheritence;

import java.util.Scanner;


public class Tables {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input");
    int x=sc.nextInt();
    int sum=0;
    for(int i=1;i<=10;i++)
    {
    	System.out.println(x+"*"+i+"="+x*i);
    	sum=sum+(x*i);
    }
    System.out.println(sum);
    
    		

	}

}
