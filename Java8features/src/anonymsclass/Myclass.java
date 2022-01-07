package anonymsclass;

public class Myclass {
public static void main(String[] args) {
		Test test = new Test(){          // from here to 
		@Override
		public void message(){
			System.out.println("hai"); //to here anonyms class
		}
		};
		test.message();
		Test test1=()->{                       //from here lambda expresion start
			System.out.println("hello");
};                                  //to here
test1.message();
	}

}
