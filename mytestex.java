public class mytestex {
    public static void main(String []s)
    { int a,b,c;
        try{
         a=0;
         b=8;
         c=b/a;
         System.out.println(c);
        }catch(ArithmeticException e)
        {
            System.out.println("handled"+"there might be a number dividing by Zero. Please Correct IT");
            
        }
        finally
        {
            System.out.println("No Appropriate handler Here");
            System.gc();
        }
        
        System.out.println("Thank you for learning");
    }
    
}
