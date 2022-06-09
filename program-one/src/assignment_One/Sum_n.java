package assignment_One;

import java.util.Scanner;

public class Sum_n {
    private static Scanner input = new Scanner(System.in);
    public static int SummationOfNums(){
        System.out.println("enter any number: ");
        int size = input.nextInt();

        int sum = 0;
        for (int i = 0; i <= size; i++){
            if (i > 0){
                sum += i;
            }
        }
        System.out.println("Summation of n numbers less than " + size + " :" + sum);
        return 0;
    }
}
