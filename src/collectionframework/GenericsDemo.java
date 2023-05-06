package collectionframework;

public class GenericsDemo<T> {
    private T t ;
private int i;
    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        GenericsDemo<Integer>obj1 =new GenericsDemo<>();
        obj1.setT(10);
        System.out.println(obj1.getT());
        GenericsDemo<String>obj2=new GenericsDemo<>();
        obj2.setT("pune");
        System.out.println(obj2.getT());

    }
}
