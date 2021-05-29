package wrapperClass123;

public class Testnew {
    public static void main(String[] args) {
        try {
            int result=0;
            int i=100;
            result=i/0;

        }
        catch (ArithmeticException e)
        {
            System.out.println("We are dividing by zero");
            e.printStackTrace();

        }
    }
}
