import java.util.Scanner;
class arraymarks
{
    public static void main(String[] args) {
        int []arr=new int[5];
        Scanner sc=new Scanner(System.in);
       System.out.println("Enter 5 Subjects marks: Physics,Chemestry,math,bio,computer");
        for(int i=0;i<=4;i++)
        {
            arr[i]=sc.nextInt();     
         }
         int total;
         for(int i=0;i<=4;i++)
        {
            total=total+arr[i];  
         }
     double percentage=total/5;
     if(percentage>=90)
     {
        System.out.println("A GRADE");
     }
     else if(percentage>=80)
     {
        System.out.println("B grade");
     }
     else if(percentage>=70)
     {
        System.out.println("C grade");
     }

    }
}