package jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args) {
        try{
            Statement statement=Conn.getConn().createStatement();
            String update="update employee set phno=22222 where id=5" ;
            int g=statement.executeUpdate(update);
            System.out.println("record update successfully");
        }catch(Exception e){
            throw  new RuntimeException(e);
        }
    }
}
