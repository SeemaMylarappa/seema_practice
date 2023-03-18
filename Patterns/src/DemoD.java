import java.util.Scanner;
public class DemoD 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter name");
	String st=sc.next();
	for(int i=0;i<st.length();i++)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(st.charAt(j)+" ");
		}
		System.out.println();
	}
	
}
}
