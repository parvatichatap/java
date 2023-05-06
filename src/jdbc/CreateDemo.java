package jdbc;

import com.mysql.cj.xdevapi.Result;

//import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.SQLDataException;

public class CreateDemo {
    public static void main(String[] args) {

try{
    Class.forName("com.mysql.cj.jdbc.Driver");
//    Connection  connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/pc","parvati","Parvati@7038");
    Connection connection= DriverManager .getConnection("jdbc:mysql://localhost:3306/pc","parvati","Parvati@7038");

    Statement statement=connection.createStatement();
    String s="select * from student";
    ResultSet rs=statement.executeQuery(s);
    while(rs.next()){
        System.out.println(rs.getString(1) + " " + rs.getInt(2) + " " + rs.getString(3) + " " + rs.getString(4) + "  " + rs.getInt(5));
//        connection.close();
    }
}catch (Exception e){
    System.out.println(e);
}
        }
    }
