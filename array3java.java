class array3
{
    public static void main(String[] args) {
        int []arr=new int[5];
        System.out.println( "Length="+arr.length);//5
        for(int i=10;i<=40;i=i+10)
        {
            arr[i]=i;
        }
        System.out.println("Array printing using Adv. for loop");
        for(int p:arr)
        {
            System.out.println(p);
        }
    }
}