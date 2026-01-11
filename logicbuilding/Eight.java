package logicbuilding;
//Check whether a number is a PALINDROME.
public class Eight
{
public static void main(String[] args) {

	int number=12321;
	int no=number;
	int revers=0;
	while(number>0) 
	{
		int digit=number%10;
		revers=revers*10+digit;
		number=number/10;
		
	}if(no==revers)
	System.out.println(no+ " is PALINDROME");
	else
		System.out.println(no+ " is Not PALINDROME");
	
		
}
}

