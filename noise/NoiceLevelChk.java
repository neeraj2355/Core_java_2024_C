public class NoiceLevelChk {
    public boolean getnoicelevel(int nl)throws  HighNoiceLevelException
    {
        if(nl<=200)
        {
        return true;
        }
        HighNoiceLevelException ne=new HighNoiceLevelException("Very heavy Noice");
        throw ne;


    }
    
}
