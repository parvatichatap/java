package jdbc;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/** batch processing in jdbc
 * 1. Load the driver class.
 * 2. create Connection.
 * 3. Create Statement.
 * 4.Add query in the batch.
 * 5.Execute batch.
 * 6. close Connection.
 */
public class BatchDemo {
    public static void main(String[] args) throws SQLException {

                String str = "insert into employee (id,name,address) values(?,?,?)";
                PreparedStatement preparedStatement = Conn.getConn().prepareStatement(str);


                for (int i = 1; i <= 5; i++) {
                    Scanner scanner = new Scanner(System.in);

                    System.out.println("Enter id name and address phno");

                    preparedStatement.setInt(1, scanner.nextInt());
                    preparedStatement.setString(2, scanner.next());
                    preparedStatement.setString(3, scanner.next());
                    preparedStatement.addBatch();
                    preparedStatement.clearBatch();
                }

//                preparedStatement.executeBatch();
                System.out.println("record inserted successfully ");
            }
        }

