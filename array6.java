import java.util.Scanner;

class array6
{
    public static void main(String[] args) {
        int []arr=new int[5];
        System.out.println( "Length="+arr.length);//5
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter Array Elements");
        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();
        arr[3]=sc.nextInt();
        arr[4]=sc.nextInt();
        System.out.println("Array printing using Adv. for loop");
        for(int p:arr)
        {
            System.out.println(p);
        }
    }
}