package OCT.ex_16102024;

public class ex_16102024
{
    public static void main(String[] args) {
        int a=15;
        int b=10;
        int c=20;
        int result = (a >= b && a >= c) ? a : (b >= c ? b : c);
        System.out.println("maximum number is " +result);
    }
}
