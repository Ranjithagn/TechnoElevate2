package methodoverloading;

public class ChangingTheNoPar {
	public void add(int x,int y) {
	System.out.println(x+y);
}
	public void add(int x,int y,int z) {
		System.out.println(x+y+z);
	}
	public static void main(String[] args) {
		 ChangingTheNoPar obj = new ChangingTheNoPar();
		 obj.add(2,3);
		 obj.add(3,5,7);
	}
}



