import java.util.Arrays;

public class arraysort {
    public static void main(String[] args)
     {
        int []arr={23,45,1,67,34,56,5,3,8,2};
        Arrays.sort(arr);
        System.out.println("After Sorting");
        for (int p : arr) {
            System.out.println(p);
            
        }

    }
    
}
