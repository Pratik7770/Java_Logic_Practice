package logicbuilding;

//Check whether a number is POSITIVE, NEGATIVE, or ZERO
public class Four {
	public static void main(String[] args) 
	{
		int number1=10;
		
		if (number1==0) {
			System.out.println(number1 +"  is zero");
			
		} else if (number1<0)
		{
			System.out.println(number1 +"  is negated");
		}else {
			System.out.println(number1 +"  is Positive");
		}
		
	}

}
