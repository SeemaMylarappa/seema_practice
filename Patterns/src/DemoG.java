import java.util.Scanner;
public class DemoG 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the name");
	String st=sc.next();
	for(int i=1;i<=st.length();i++)
	{
		for(int j=i;j<2*i;j++)
		{
			System.out.print(st.charAt(j-1)+" ");
			if(j==st.length())
				break;
		}
		System.out.println();
	}
}
}
