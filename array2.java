class array2
{
    public static void main(String[] args) {
        int []arr=new int[5];
        System.out.println( "Length="+arr.length);//5
        arr[0]=10;
        arr[1]=100;
        arr[2]=20;
        arr[3]=30;
        arr[4]=40;
        System.out.println("Array Elements As follws using OLD for loop");
        for(int i=0;i<=4;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Array printing using Adv. for loop");
        for(int p:arr)
        {
            System.out.println(p);
        }
    }
}