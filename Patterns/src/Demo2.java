import java.util.Scanner;
public class Demo2 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter n value");
	int n=sc.nextInt();
	int k=1;
	for(int i=1;i<=n;i++)
	{
		for(int j=1;j<=n;j++)
		{
			System.out.print(k+" ");
			k++;
			if(k==10)
				k=1;
		}
		System.out.println();
	}
}
}
