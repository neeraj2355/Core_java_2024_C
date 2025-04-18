import java.util.*;
class mynumber
{

	void test(int p)
	{
		if(p>0)
		{
	System.out.println("Positive number");

		}
		else if(p<0)
		{
	System.out.println("Negative number");
		}
		else
		{
	System.out.println("Zero number");
		}
	}
	public static void main(String s[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter any number");
	int p=sc.nextInt();
		mynumber np=new mynumber();
			np.test(p);//call by value
	

	}
}