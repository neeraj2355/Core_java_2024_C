import java.util.Scanner;

public class testnoice {
    public static void main(String[] args) {
        System.out.println("Enter Noice Level in class Room");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        NoiceLevelChk c1=new NoiceLevelChk();
        try{
        boolean p=c1.getnoicelevel(n);//500
        if(p==true)
        {
            System.out.println("No issue: continue class !!!!!!!!!!!!!!");
        }
        }catch(HighNoiceLevelException e)
        {
            System.out.println("Class Noice is very High: so class Could Not Be conducted Any More");
        }
    }
    
}
