package assignment_Two;

import java.util.Scanner;

import static assignment_One.Sum_n.SummationOfNums;
import static assignment_Two.AddMatrix.MatrixAddition;
import static assignment_Two.MUlMatrix.MatrixMultiplication;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        boolean quit = false;
        int choice;

        System.out.printf("%24s\n","UR - CST, ITyr4 DATA-STRUCTURE ASSIGNMENT TWO");
        System.out.println("============================================");

        while(!quit){
            printMainMenu();
            choice = input.nextInt();
            switch(choice){
                case 1:
                    MatrixAddition();
                    System.out.println("");
                    break;
                case 2:
                    MatrixMultiplication();
                    System.out.println("");
                    break;
                case 3:
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
        "1 - Adding Matrix\n" +
        "2 - Multiplying Matrix\n" +
        "3 - Exit the program\n" +
        "========================================\n" +
        "Choice: ","Data structure Second assignment");
    }
}

