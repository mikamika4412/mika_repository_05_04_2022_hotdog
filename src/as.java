//package com.example;
//
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class Main {
//    private static final String INPUT_1_TXT = "input1.txt";
//    private static final String INPUT_2_TXT = "input2.txt";
//    private static final String OUTPUT_TXT = "output.txt";
//    private static final String HOT = "Hot";
//    private static final String DOG = "Dog"; //need to be updated spliterator for file reader
//
//    public static void main(String[] a) {
//        List<Integer> listOfFileValuesInput1 = getListOfFileValues(INPUT_1_TXT);
//        List<Integer> listOfFileValuesInput2 = getListOfFileValues(INPUT_2_TXT);
//        if (!listOfFileValuesInput1.isEmpty() && listOfFileValuesInput1.size() >= 2 && !listOfFileValuesInput2.isEmpty()) {
//            Integer x = listOfFileValuesInput1.get(0);
//            Integer y = listOfFileValuesInput1.get(1);
//            listOfFileValuesInput2.forEach(value -> {
//                if (value % x == 0 && value % y == 0) {
//                    writeToFile(HOT + DOG, OUTPUT_TXT);
//                } else if (value % x == 0) {
//                    writeToFile(HOT, OUTPUT_TXT);
//                } else if (value % y == 0) {
//                    writeToFile(DOG, OUTPUT_TXT);
//                } else {
//                    writeToFile(value.toString(), OUTPUT_TXT);
//                }
//            });
//        } else {
//            System.out.println("Input data is incorrect please double check it");
//        }
//    }
//
//    private static void writeToFile(String valueToWrite, String fileName) {
//        FileOutputStream outputStream = null;
//        try {
//            outputStream = new FileOutputStream(fileName);
//        } catch (FileNotFoundException e) {
//            System.out.println("File: {" + fileName + "} not found");
//            System.exit(1);
//        }
//        String value = valueToWrite + " ";
//        byte[] strToBytes = value.getBytes();
//        try {
//            outputStream.write(strToBytes);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                outputStream.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    private static List<Integer> getListOfFileValues(String fileName) {
//        File file = new File(fileName);
//        Scanner scanner = null;
//        List<Integer> result = new ArrayList<>();
//        {
//            try {
//                scanner = new Scanner(file);
//            } catch (FileNotFoundException e) {
//                System.out.println("File: {" + fileName + "} not found");
//                System.exit(1);
//            }
//        }
//        while (scanner.hasNextLong()) {
//            result.add(scanner.nextInt());
//        }
//        return result;
//    }
//}
