interface Square {
    int calculate(int x);
}

class Test {
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        //Square s = (int x) -> x * x;
        square p=(int x)->x*x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = p.calculate(a);
        System.out.println(ans);
    }
}