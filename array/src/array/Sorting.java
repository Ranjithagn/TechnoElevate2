package array;

public class Sorting {    //ARRANGING IN PROPER ORDER
public static void main(String[] args) {           //accsending order
	int a[]={3,18,17,45,99,7,1,10,8,12};
	//System.out.println(a.length);
	int temp;
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++)
			
		{
			if(a[i]>a[j]){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
			}
		}
		
	}
	for(int x:a) {
		//System.out.println(a); //it will show address
		System.out.println(x);
	}
	System.out.println("**********************************");
	int largest=a[a.length-1];
	System.out.println(largest);
	System.out.println("&&&&&&&&&&&&&&");
	int smallest=a[0];
	System.out.println(smallest);
}
}
