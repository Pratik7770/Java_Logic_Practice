package logicbuilding;

public class Fourteen {
	//Print the Fibonacci series up to n terms.
	public static void main(String[] args) {
		
		int n=7;
		int a=0;
		int b=1;
		
		System.out.println(a);
		System.out.println(b);
		for(int i=3;i<=n;i++) 
		{
			
			int num = a+b;
			System.out.println(num);
			a=b;
			b=num;
			
			
		}
		
	}
	
	

}
