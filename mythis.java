public class mythis {
    int a,b;//instance variable
    mythis(int a,int b)//local variable
    {
        this.a=a;//initililization from local to instance variable
        this.b=b;//local variable get reinitilized 
    }
    void add()
    {
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        mythis m1=new mythis(10, 20);
        m1.add();
        
    }
}
