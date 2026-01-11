package logicbuilding;
//Reverse a number
//Input: 1234
//Output: 4321

public class Seven {

	public static void main(String[] args)
	{
		int number=1234;
		int revers=0;
		while(number>0) 
		{
			int digit=number%10;
			revers=revers*10+digit;
			number=number/10;
			
		}
		System.out.println(revers);
	}
		
	}

