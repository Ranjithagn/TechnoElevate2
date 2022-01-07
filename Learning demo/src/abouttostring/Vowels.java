package abouttostring;

public class Vowels {

	public static void main(String[] args) {
		int vCount = 0;
		int ccount = 0;
		/*int space=0;*/
		String str = "ranjithagn hai";
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				vCount++;
			} else {
				ccount++;

			}

		}
//		for(int i=0; i<str.length(); i++){
//			if(str.charAt(i)==' '){
//				space++;
//			}
//		}
		System.out.println(vCount);
		System.out.println(ccount);
		//System.out.println(space);
	}

}
