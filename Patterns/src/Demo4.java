import java.util.Scanner;
public class Demo4 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print((n-j)+" ");
		}
		System.out.println();
	}
}
}
