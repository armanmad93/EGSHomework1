package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(intToBinary(55));
        System.out.println(binaryToInt("110111"));
        System.out.println(binaryToHexadecimal("100110001"));
        System.out.println(howManyBitsCalculator(55));
    }

    // convert int to binary
    public static String intToBinary(int number) {
        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.append(number % 2 == 0 ? "0" : "1");
            number = number / 2;
        }
        return binary.reverse().toString();
    }

    //convert binary to int
    public static int binaryToInt(String binary) {
        char[] numbers = binary.toCharArray();
        int result = 0;
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (numbers[numbers.length - 1 - i] == '1') {
                result += (int) Math.pow(2, i);
            }
        }
        return result;
    }

    //convert binary to hexadecimal
    public static String binaryToHexadecimal(String binary) {
        StringBuilder hexadecimal = new StringBuilder();
        int number = binaryToInt(binary);
        String[] hexadecimalArrayIndexes = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F"};

        while (number > 0) {
            hexadecimal.append(hexadecimalArrayIndexes[number % 16]);
            number = number / 16;
        }
        return hexadecimal.reverse().toString();
    }

    //bits calculator
    public static String howManyBitsCalculator(int number) {
        String binary = intToBinary(number);
        int count = 0;

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        return "This number have: " + String.valueOf(count) + " bits.";
    }
}


