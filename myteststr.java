public class myteststr {
    int a;
    public static void main(String[] args) {
	try
	{
		String p="vande";
	System.out.println(p.charAt(0));
	System.out.println(p.charAt(-2));
	System.out.println(p.charAt(1));
	System.out.println(p.charAt(2));
	}
	catch(NumberFormatException e)
	{
	System.out.println("Illegal  Number Conversion");	
	}
	catch(Exception e)
	{
	System.out.println("You Are Using  an Invalid index");	
	}

    }
    
}