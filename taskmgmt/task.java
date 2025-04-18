package taskmgmt;
import java.util.*;
public class task {
    int tid;
    String taskname;
    String taskpty;
    String taskdesc;
    static int  ttid=0;

task()
{

}

task(String taskname,String taskpty,String taskdesc)
{
    tid=++ttid;
    this.taskname=taskname;
    this.taskdesc=taskdesc;
    this.taskpty=taskpty;
}
}
