//WAP to showcase Default thread.
public class mythread1 {
    public static void main(String[] args) {
        Thread th=Thread.currentThread();
        System.out.println(th);
        th.setName("Bahubali");
        System.out.println(th);
        th.setPriority(10);
        System.out.println(th);
        
    }
    
}
