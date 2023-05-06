package exceptionhandling;

public class StackOverFlow {
    public static void main(String[] args) {
        StackOverFlow obj = new StackOverFlow();
        obj.rec(8);
    }
        public void rec(int i)
        {
          if (i==0) {
              return;
          }
          else {
              rec(i);
          }
        }
    }

