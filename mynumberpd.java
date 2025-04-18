import java.util.Scanner;
public class mynumberpd {
    public static void main(String[] args) {
        System.out.println("Enter Any number you want tp check for palindrom");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int sum=0;
        int a;
    while(n>0)
        {
            a=n%10;
            sum=(sum*10)+a;
            n=n/10;
        }
        System.out.println("After reverse is="+sum);
    if(original==sum)
        System.out.println("palindrom");
        else
        System.out.println("Not palindrom");
   
    
}
}

