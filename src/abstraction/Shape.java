package abstraction;

 interface Shape
{
    public void calculateArea(int length, int breadth);
}

interface Triangle{
   public void calculateArea(int length,int breadth,int height);

}


  abstract class Rectangle implements Shape,Triangle {
        public void calculateArea(int length, int breadth,int height) {
            System.out.println("The area of the rectangle is " + (length * breadth));
            System.out.println("The area of The triangle is  "+(length * breadth * height));
        }
    }

    class Main {
        public static void main(String[] args) {
            Rectangle rect = new Rectangle() {
                @Override
                public void calculateArea(int length, int breadth) {

                }
            } ;



          rect.calculateArea(10,7,12);
            }
        }


