package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class InsertDemo {
    public static void main(String[] args) {
        try{
            Statement statement = Conn.getConn().createStatement();

            ///*********** insert ************
           String inert= "insert into employee(id,name,address,phno) values(2,'arohi','kranja',9660)";
//            String insert="insert into employee(id,name,address)values(1,'aad','satara')";
            int i = statement.executeUpdate(inert);
            System.out.println("record inserted successfully"+i);




        }catch(Exception e){
           throw  new RuntimeException(e);
        }
    }
}
