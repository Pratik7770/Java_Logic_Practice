package logicbuilding;

//Find the largest of THREE numbers
//a = 10, b = 25, c = 15
//Output: 25

public class Three 
{
	public static void main(String[] args) 
	{
		int number1=10;
		int number2=25;
		int number3=15;
		if (number1>number2 && number1> number3) {
			System.out.println(number1 +" Largest Number");
			
		} else if (number2>number1	 && number2> number3)
		{
			System.out.println(number2 +" Largest Number");
		}else {
			System.out.println(number3 +" Largest Number");
		}
		
	}
}
