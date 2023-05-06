package jdbc;

import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedDemo {
    public static void main(String[] args) {
        int id;
        String name;
        String address;

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter id,name,address");
          id=scanner.nextInt();
          name=scanner.next();
          address=scanner.next();

          try{
              String str="insert into employee (id,name,address)values(?,?,?)";
              PreparedStatement preparedStatement=Conn.getConn().prepareStatement(str);
              preparedStatement.setInt(1,id);
              preparedStatement.setString(2,name);
              preparedStatement.setString(3,address);
              int i=preparedStatement.executeUpdate();
              System.out.println("record insert sucessfully");
          }catch(Exception e)
          {
              throw new RuntimeException(e);
          }
    }
}

