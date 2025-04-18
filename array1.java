class array1
{
    public static void main(String[] args) {
        int []arr={10,20,30,40,50};//size=5
        System.out.println( "Length="+arr.length);
        System.out.println("Array Elements As follws");
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