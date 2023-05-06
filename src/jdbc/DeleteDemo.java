package jdbc;

import java.sql.Statement;

public class DeleteDemo {
    public static void main(String[] args) {
        try {
            Statement statement=Conn.getConn().createStatement();
            String d="delete from employee where id=2 ";
            int i=statement.executeUpdate(d);
            System.out.println("record delete successfully ");
        }catch (Exception e){
            throw  new RuntimeException(e);
        }
    }
}
