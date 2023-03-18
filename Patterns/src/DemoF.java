import java.util.Scanner;
public class DemoF
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value");
	int n=sc.nextInt();
	int sum=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j>=1;j--)
		{
		System.out.print(sum%2+" ");
		sum++;
		}
		System.out.println();
	}
}
}
