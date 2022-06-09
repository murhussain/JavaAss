package assignment_One;
import java.util.Scanner;
import static assignment_One.Sum_n.SummationOfNums;
import static assignment_One.sum_square_n.SummationOfNumsSquared;
import static assignment_One.sum_odd_n.SummationOfAllOddNums;
import static assignment_One.sum_even_n.SummationOfAllEvenNums;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        System.out.printf("%24s\n","UR - CST, ITyr4 DATA-STRUCTURE ASSIGNMENT ONE");
        System.out.println("============================================");

        while(!quit){
            printMainMenu();
            choice = input.nextInt();
            switch(choice){
                case 1:
                    SummationOfNums();
                    System.out.println("");
                    break;
                case 2:
                    SummationOfNumsSquared();
                    System.out.println("");
                    break;
                case 3:
                    SummationOfAllEvenNums();
                    System.out.println("");
                    break;
                case 4:
                    SummationOfAllOddNums();
                    System.out.println("");
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        }
        input.close();
    }

    public static void printMainMenu(){
        System.out.printf("%24s\n" +
        "=========================================\n" +
        "Please select an option:\n" +
        "1 - Entire Sum of numbers\n" +
        "2 - Square Sum of numbers\n" +
        "3 - Sum of all odd numbers\n" +
        "4 - Sum of all even numbers\n" +
        "5 - Exit the program\n" +
        "========================================\n" +
        "Choice: ","Data structure first assignment");
    }
}
