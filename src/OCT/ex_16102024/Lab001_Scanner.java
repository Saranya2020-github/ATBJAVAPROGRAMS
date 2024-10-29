package OCT.ex_16102024;

import java.util.Scanner;

public class Lab001_Scanner {
    public static void main(String[] args) {
        //scanner---class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age\n");
        int age = scanner.nextInt();
        System.out.println(age >= 18 ? "Allowed to vote " : "Not allowed to vote" );

        scanner.close();



    }
}
