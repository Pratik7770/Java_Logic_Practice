package logicbuilding;

//Check whether a number is a PERFECT number

public class Fifteen

{
	public static void main(String[] args) {
		int number=6;
		int sum=0;
	for(int i=1;i<=number-1;i++)
	{
		if(number%i==0) {
			sum=sum+i;
		}
		
	}
	if(number==sum) {
		System.out.println("given number "+ number +" is Perfect no");
	}
	else {
		System.out.println("given number " +number+ " is NOT Perfect no");
	}
		
	
	}

}
