import java.util.*;
public class myrandom {
    public static void main(String s[])
    {
        Random rn=new Random();

        for(int i=0;i<=9;i++)
        {
            System.out.println(rn.nextInt(100));
        }
    }
    
}
