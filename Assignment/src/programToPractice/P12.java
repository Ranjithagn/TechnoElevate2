package programToPractice;


	public class P12 {

		public static void printFactors(int number) {

			if (number < 1) {
				System.out.println("Invalid Value");
			}

			for (int i = 1; i <= number; i++) {
				if (number % i == 0) {
					System.out.print(i + " ");
				}
			}
		}
		public static void main(String[] args) {
			P12 p12 = new P12();
			P12.printFactors(0);
		}
	}


