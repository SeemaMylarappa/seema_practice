import java.util.Scanner;
public class DemoB 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();

	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<=n;j++)
		{
			System.out.print((char)(j+64)+" ");
			
		}
		System.out.println();
	}
}
}
