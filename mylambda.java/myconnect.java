import java.sql.*;
public class myconnect {
    public static void main(String[] args) {
        try{
        Class.forName("Orcale.jdbc.driver.oracleDriver");
        }catch(ClassNotFoundException e)
        {
            System.out.println("Driver UnAvilable");
        }
    }

    
}
