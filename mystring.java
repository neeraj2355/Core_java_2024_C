public class mystring {
    public static void main(String[] args) {
        String s1="ITM";//Way-1
        String s2=new String("gwalior");//way-2
        System.out.println(s1.length());//3
        System.out.println(s2.length());//7
        //String s3=s1+s2;//inappropriate
        String s3=s1.concat(s2);//correct one
        System.out.println(s3);
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.charAt(1));
        System.out.println(s1.equals(s3));
        System.out.println(s1.compareTo(s3));
        




    }
    
}
