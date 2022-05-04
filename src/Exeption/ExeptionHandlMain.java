package Exeption;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExeptionHandlMain<continieLoop> {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continieLoop = true;

        do {
            try {
                System.out.println("Please enter numirator");
                int numirator = scanner.nextInt();
                System.out.println("Please enter denumirator");

                int denumirator = scanner.nextInt();
//                System.out.println(divide(numirator, denumirator));
//                saveTofile(divide(numirator, denumirator));
                PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
                writer.println("Result = "+divide(numirator, denumirator));

                continieLoop = false;
            } catch (ArithmeticException | InputMismatchException | IOException e) {
                System.out.println("args = " + e);
                scanner.nextLine();
                System.out.println("Only integer  and non-zero parametr allowed or file trowble");
                e.printStackTrace();
            } finally {
                writer.lose();
            }
        } while (continieLoop);
    }

    public static int divide(int numirator, int denumirator) {
        return numirator / denumirator;
    }
//    private static void saveTofile(int res) throws IOException {
//        PrintWriter writer = new PrintWriter(new FileWriter("out.txt"));
//        writer.println("Result = "+res);
//        writer.close();
//
//    }
}
