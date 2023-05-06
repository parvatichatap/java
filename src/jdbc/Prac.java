package jdbc;



import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;


public class Prac {
        public static void main(String[] args) {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Pc", "parvati",
                        "Parvati@7038");
                con.setAutoCommit(false);
                File fileObject = new File("E:");
                String q = "insert into readings values(?,?,?,?)";
                PreparedStatement pstmt = con.prepareStatement(q);
                int count=0;
                while (true) {

                    LocalDateTime createdDateTime = LocalDateTime.now();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

                    double totalSpace = (double) fileObject.getTotalSpace() / 1073741824;
                    double freeSpace = (double) fileObject.getFreeSpace() / 1073741824;
                    double usedSpace = totalSpace - freeSpace;

                    System.out.println("Total Space: " + totalSpace);
                    System.out.println("Free Space: " + freeSpace);
                    System.out.println("Used Space: " + usedSpace);
                    System.out.println("Created Date Time: " + dtf.format(createdDateTime));

                    pstmt.setDouble(1, totalSpace);
                    pstmt.setDouble(2, freeSpace);
                    pstmt.setDouble(3, usedSpace);
                    pstmt.setString(4, dtf.format(createdDateTime));

                    pstmt.addBatch();
                    count++;
                    //int res = pstmt.executeUpdate();
                    //System.out.println("Inserted Record: " + res);s

                    Thread.sleep(2000);

                    if(count==5) {
                        int []res=pstmt.executeBatch();
                        con.commit();
                        System.out.println(Arrays.toString(res));
                        con.close();
                        pstmt.close();
                        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sysmonitor", "root",
                                "password");
                        pstmt = con.prepareStatement(q);
                        con.setAutoCommit(false);
                        count=0;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

