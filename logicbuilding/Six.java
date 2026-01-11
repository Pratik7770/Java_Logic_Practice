package logicbuilding;
/*Find the SUM of digits of a number


/*Input: 1234
Output: 10
(1 + 2 + 3 + 4)
*/
public class Six
{
	public static void main(String[] args) {
		int no=1234;
		int sum=0;
		while(no>0) 
		{
			int digit=no%10;
			
			sum=sum+digit;
			
			no=no/10;
			
		}
		System.out.println(sum);
	}

}
