//java program to find maximum element of Array

import java.util.Scanner;

public class maxarray {
    int []a; //instance array

    maxarray()
    {
        a=new int[5];
    }
    void getarray()
    {
        System.out.println("Enter Array Elemensts");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void maxelement()
        {
            int max=a[0];//assuming first element is maxmimum
            for (int p : a) {
                if(p>=max)
                {
                    max=p;
                }
              
                
            }
            System.out.println("MAximum array elemnt is="+max);
        }
        public static void main(String[] args) {
            maxarray m=new maxarray();//invoked Constructor
            m.getarray();
            m.maxelement();

        }
    
}
