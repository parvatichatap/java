package example;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class CurrentDateTime {
    public static void main(String[] args) {
        LocalDateTime current=LocalDateTime.now();
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("YYY-MM-dd HH:mm:ss.SSS");
      //  String formatted = current.format(formatter);
String formatted =current.format(formatter);
        System.out.println("Current Date and Time is: " + formatted);
    }
}

