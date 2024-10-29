package OCT.ex_29102024_Arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab130_Array_Userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array that you want to create!");
        int size = sc.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter the number" +(i+1));
            numbers[i] = sc.nextInt();

        }
        System.out.println("------------------------");
        //print the number enter by the user
        System.out.println("The numbers are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
