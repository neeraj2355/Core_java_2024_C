package taskmgmt;

import java.util.ArrayList;
import java.util.*;

public class taskopr {
    ArrayList<task> l1;

    taskopr()
    {
        
    }
    void addtask()
    {

    }
    void deletetask()
    {
        
    }
    void updatetask()
    {
        
    }
    void searchtask()
    {
        
    }
    void showAlltask()
    {
        
    }
    public static void main(String[] args) {
        task t1=new task("LECTTURE","High","PBL Demo");
        taskopr op=new taskopr();
        ArrayList<task> l1=new ArrayList<task>();
    
        l1.add(t1);

        task t2=new task("NAAC","Moderate","SSS Submission");
        l1.add(t2);

        task t3=new task("LUNCH","Low","lunch with Friends");
        l1.add(t3);

        System.out.println("All task as Follows");
        for (task t : l1) {
            System.out.println(t.tid+" "+t.taskname+" "+t.taskpty+t.taskdesc);
            
        }

    }
    
}
