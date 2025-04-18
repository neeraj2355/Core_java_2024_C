import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        int []a={2,4,5,1,34,22,12};
        String flag="RED";
        System.out.println("Enter Element you want to search");
        Scanner sc=new Scanner(System.in);
        int value=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==value)
            {
                System.out.println("avileble at position"+(i+1));
                flag="Green";//green
                break;
            }

        }
        if(flag=="RED")
        {
            System.out.println("UnAvilable");
        }
    }
    
}
