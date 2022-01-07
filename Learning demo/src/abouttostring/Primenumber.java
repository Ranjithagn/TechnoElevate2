package abouttostring;

public class Primenumber {

	public static void main(String[] args) {
		int n=8;
		int temp = 0;
		for (int i = 2; i < n - 1; i++) {
			if(n%i==0){
				temp=temp+1;
			}
		}
			if(temp==0){
			System.out.println("given number is prime number");
			} else{
				System.out.println("given number is not a prime number");
			}
		

	}

}
