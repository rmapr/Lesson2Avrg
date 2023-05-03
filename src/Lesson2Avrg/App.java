package Lesson2Avrg;

import java.util.Scanner;

public class App {
    static Scanner sc;
    static int numTask;
    public static void main(String[] args) {
        numTask = getNumTask();
        switch (numTask) {
            case 1 -> {
//                calcAvrgTwoNumbers();
            }
            case 2-> {
//                calcAvrgAnyNumbers();
            }
            default ->{
                System.out.println("Shutdown...");
                sc.close();
            }
        }
    }
    private static double getAvrgNumbers(double sum, double number){
        return sum / number;
    }

    private static int getNumTask(){
        printMenu();
        sc = new Scanner(System.in);
        return sc.nextInt();
    }
    private static void printMenu(){
        System.out.print("Enter task number (1,2 or 0):\n" +
                "1: Arithmetic mean of two numbers;\n" +
                "2: Arithmetic mean of an arbitrary number of numbers\n" +
                "0: Exit.\n");
    }
}
