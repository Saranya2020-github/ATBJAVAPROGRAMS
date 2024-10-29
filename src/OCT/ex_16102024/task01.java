package OCT.ex_16102024;

import java.sql.SQLOutput;

public class task01 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        System.out.println(a);

        // A> --a > 19 -> a=19
        //B> a++ > 19-> a=20
        // C>a-- >20-> a=19
        }
}
