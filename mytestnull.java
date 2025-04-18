public class mytestnull {
    int a;
    public static void main(String[] args) {
	try
	{
        mytestnull m1=new mytestnull();
	 mytestnull m2=null;
            m1.a=10;
            System.out.println(m1.a);
	System.out.println(m2.a);
	}catch(NullPointerException e)
	{
	System.out.println("Illegal Opertaion using Null variable");	
	}

    }
    
}