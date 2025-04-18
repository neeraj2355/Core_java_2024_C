//Creatting  user Defined thread using Thread class
public class mythread3 extends Thread
{
     public void run()
    {
System.out.println("Helo Devsena");
System.out.println("Message Printed BY "+Thread.currentThread().getName());
    }
public static void main(String[] args) {
    mythread3 mt3=new mythread3();
    Thread t1=new Thread(mt3);
    Thread t2=new Thread(mt3);
    t1.setName("bahubali");
    t2.setName("Bhalla");
    t1.start();t2.start();
}
    
}
