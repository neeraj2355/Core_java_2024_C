import java.util.*;
public class exam {
    public static void main(String s[])
    {
        int []a=new int[5];
        int []b=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array 1 values");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();

        }
        System.out.println("Enter Array 2 values");
        for(int i=0;i<a.length;i++)
        {
            b[i]=sc.nextInt();
        }
        int []c=new int[10];

        for(int i=0;i<=4;i++)
        {
            c[i]=a[i];
            c[i+5]=b[i];
        }
        System.out.println("After Copying Third Array");
        for(int i=0;i<10;i++)
        {
            System.out.println(c[i]);
        }

    }

    
}
