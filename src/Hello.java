import java.util.Scanner;


public class Hello 
{
	
	
	public static void bizz(int n)
	{
		if(n%3 == 0)
		{
			System.out.printf("\n cool t'es multiple de 3");
		}
	}
	
	public static void main (String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Tapez un nombre : ");
		String str = sc.nextLine();
		bizz(Integer.parseInt(str));
		
		sc.close();
		
	}
	


}
