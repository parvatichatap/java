package inheritance;


import abstraction.Sports;

public class Football implements Sports {
    public void show()
    {
        System.out.println("in show");
        System.out.println("cricket");

    }

    public static void main(String[] args) {
        Football f1=new Football();
        f1.show();
    }
}

