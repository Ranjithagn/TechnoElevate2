
package methodoverloading;

public class Varargsmethod {
	public static int add(int...x) {  //x is arrays length
		int result=0;
		for(int i=0;i<x.length;i++) {
			result +=x[i];
		}
		return result;
		}
	public static void main(String[] args) {
		int sum = add(1,2,3,43);
		System.out.println(sum);
	}
		
	}


