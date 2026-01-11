package logicbuilding;
//Count number of digits in a number
public class Nine {
	public static void main(String[] args) {
		int num=1234;
		int c=0;
		while(num>0) 
		{
			num=num/10;
			c++;
			
		}
		System.out.println(" count of number is "+c);
	}

}
