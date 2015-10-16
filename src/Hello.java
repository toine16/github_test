import java.util.Scanner;


public class Hello 
{
	
	
	public static void bizzbuzz(int n, int m)
	{
		if(n%3 == 0)
		{
			System.out.printf("\n cool t'es multiple de 3");
			System.out.printf("\n cool t'es multiple de 3");

			System.out.printf("\n cool t'es multiple de 3");

		}
	}
	

	
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Tapez un nombre : ");
		String str = sc.nextLine();
		bizzbuzz(Integer.parseInt(str),5);
		
		sc.close();
		
	}
	
/***
 * nbblz^fl^zekf^zefk
 */

}
