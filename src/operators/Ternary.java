package operators;

public class Ternary {
    public static void main(String[] args) {


        int a = 30, b = 50,c=60 ,max;
        max = (a < b) ? (a>c ? a: c):(b<c ? b:c);

        System.out.print(max);
    }
}
