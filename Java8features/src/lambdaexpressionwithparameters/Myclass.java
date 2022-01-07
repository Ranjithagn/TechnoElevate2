package lambdaexpressionwithparameters;

public class Myclass {

	public static void main(String[] args) {
	/*	Test test1=(i,j)->{
			System.out.println(i+j);
			return i+j;
		};
		test1.add(10,20 );*/
		Runnable run=()->{
			for(int i=0;i<5;i++)
				System.out.println(i);
		};
		Thread thread = new Thread(run);
		thread.start();
	}
	

}
