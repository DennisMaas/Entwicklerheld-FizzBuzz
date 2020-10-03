package de.neuefische.dennis.entwicklerheld;

public class Fizzbuzz {
    public static void main(String[] args) {

        int number = 14;
        System.out.println(fizzbuzz(number));
    }

    static String fizzbuzz(int number){
        if (number%5 == 0 && number%3 == 0) return "fizzbuzz";
        if (number%3 == 0 && number%5 != 0) return "fizz";
        if (number%5 == 0 && number%3 != 0) return "buzz";
        return Integer.toString(number);
    }
}