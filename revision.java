import java.util.*;

public class revision {
    int x;//instance variable
    static int y;//class variable
    int []a;  // Instance  array integer type

    public revision()
    {
        x=10;
        y=20;             //initilize members of the class 
        a=new int[5];
    }
    void getarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }


    }

    void show()
    {         
        System.out.println( "Non Static"+(x+y));
        for (int p : a) {
            System.out.println(p);
                                //Advanced For Loop
        }

    }
     static void test()
    {
        System.out.println("This is Static"+(y));        // will be executed by class name as well as object
    }
    public static void main(String[] args) {
        revision r=new revision();// constructor invoked
        r.getarray();
        r.show();
        revision.test();
        
    }    
}
