import java.util.Scanner;
public class DemoH 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	
	for(int i=1;i<=n;i++)
	{
		for(int j=i;j<2*i;j++)
		{
			System.out.print((char)(j+64)+" ");
			
		}
		System.out.println();
	}
}
}