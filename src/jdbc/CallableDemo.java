package jdbc;

import java.sql.CallableStatement;
import java.sql.ResultSet;

public class CallableDemo
{
    public static void main(String[] args) {
        try{
            CallableStatement callableStatement=Conn.getConn().prepareCall("call getData");
            ResultSet rs=callableStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt(1)+""+rs.getString(2)+""+rs.getString(3));
            }
        }catch(Exception e){
            throw new RuntimeException(e);
        }
    }
}
