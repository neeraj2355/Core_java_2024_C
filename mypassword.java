import java.util.*;
public class mypassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First name");
        String fname=sc.next();
        System.out.println("Enter Your last name");
        String lname=sc.next();
        String password="";
       password=password+Character.toUpperCase(fname.charAt(0));
       password=password+Character.toLowerCase(fname.charAt(2));
       password=password+Character.toUpperCase(fname.charAt(4));
       password=password+"-";
       password=password+Character.toLowerCase(lname.charAt(1));
       password=password+Character.toUpperCase(lname.charAt(3));
       password=password+Character.toUpperCase(lname.charAt(5));
       System.out.println("password As follows");
       System.out.println(password);
        
    }

    }

