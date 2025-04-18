//constructor chaining
public class mychain {
    mychain()
    {   this(1,2);
        System.out.println("Zero");
    }
    mychain(int x)
    {   this(1,2);
        System.out.println("Two");
    }
    mychain(float y)
    {   this(2);
        System.out.println("Three");
    }
    mychain(int x,int y)
    {
        this(2.3f);
        System.out.println("FOur");
        
    }
    
    public static void main(String[] args) {
        mychain m1=new mychain(2,3);
    }
}
