package multithreading;


class TotalEarning extends  Thread{
    int total=0;
    public void run()
    {
        for (int i=1;i<=10;i++) ;
        {
            total=total=100;
        }
    }
}
public class InterThread {
    public static void main(String[] args) {
        TotalEarning te=new TotalEarning();
        te.start();
       // System.out.println(" Total Earning : "+te.total +"rs");
    }

}
