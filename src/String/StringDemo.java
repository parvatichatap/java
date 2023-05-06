package String;

public class StringDemo {
    public static void main(String[] args) {
String str1="Mumbai";
String str="pune";
str =str.concat("hii");
        System.out.println(str);
        System.out.println(str.getBytes());
        String str2="hello     p ";
        String str3="abcdef";
        System.out.println(str2.trim());
      System.out.println(str2.compareTo(str3));
        System.out.println(str1==str);
        System.out.println(str2.equals(str3));
        System.out.println(str3.startsWith("a"));
        System.out.println(str3.indexOf("c"));
        System.out.println(str2.charAt(4));
       System.out.println(str2.contains("p"));
        str3 = str3.concat("g");
        System.out.println(str3);
        str3 = str3.replace('c','p');
        System.out.println(str3);


        str2 = str2.substring(3,4);
        System.out.println(str2);

        String str5="8";
        Integer i=Integer.valueOf(str5);
        System.out.println(i);

    }
}