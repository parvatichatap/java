package java8;


import java.util.function.Function;

class FunctionalImpl implements Function<String,Integer>{
   public  Integer apply(String s){
       return s.length();
   }
}

public class FunctionalDemo {
    public static void main(String[] args) {
//        Function<String,Integer>function=new FunctionalImpl();
//        System.out.println(function.apply("ramu1234"));
        Function<String,Integer> function= (String s)-> s.length();
        System.out.println(function.apply("paru"));
    }
}
