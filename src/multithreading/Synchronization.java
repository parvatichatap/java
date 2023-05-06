package multithreading;


class BookTheaterSet extends  Thread {
    int total_seat=10;
    synchronized void bookseat(int seats) {       //----------synchronized Method
       // void bookseat(int seats) {

       if (total_seat >= seats) {
           System.out.println(seats + " seats booked successfully");
           total_seat = total_seat - seats;
           System.out.println("seats Left: " + total_seat);

       } else {
           System.out.println(" sorry seat can not book");
           System.out.println("seats Left: " + total_seat);
       }

    }
}


public class Synchronization extends  Thread {
    static BookTheaterSet b;
    int seats;
        @Override
        public void run(){
            b.bookseat(seats);
    }

    public static void main(String[] args) {
        b=new BookTheaterSet();
        Synchronization s1=new Synchronization();
        s1.seats=7;
        s1.start();
        Synchronization s2=new Synchronization();
        s2.seats=6;
        s2.start();
    }
}

