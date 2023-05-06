package inheritance;

interface Account {
    float rate=12;
    void set();
    void display();
}
interface person
{
    void store(String n,String a);
    void disp();
}
abstract class Customer implements Account,person {
    public void main(){

    }
    int n, acc, bal;
    String name, addr ;

    public void set(int accno) {
        acc = accno;
    }

     public  void display() {
         System.out.println("Account No :" + acc);
         System.out.println("Balance Rs :" + bal);

     }


    public void store(String n, String a) {
       n= name;
       a= addr;
    }
    public void disp () {
        System.out.println("Name :-"+name);
        System.out.println("Address :-"+ addr);
    }

     public void interset() {
        float inter = (rate * bal * n) / 100;
        System.out.println("Interest :" + inter);
    }

    Customer(int b, int num) {
        bal = b;
        n = num;
    }
}
    abstract class interfaceDemo
    {
        public static void main(String[] args) {

            Customer C1= new Customer(1500, 2) {
                @Override
                public void set() {

                }
            };

            C1.set(1234567678);
            C1.store("paru","pune");
            C1.display();
            C1.interset();
        }
    }

