public class myteststr {
    int a;
    public static void main(String[] args) {
	try
	{
		String p="vande";
	System.out.println(p.chatAt(0));
	System.out.println(p.chatAt(-2));
	System.out.println(p.chatAt(1));
	System.out.println(p.chatAt(2));
	}catch(NumberFormatException e)
	{
	System.out.println("Illegal  Number Conversion");	
	}
    }
    
}