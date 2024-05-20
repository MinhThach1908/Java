package aptech.day9;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        StringHelper stringHelper = new StringHelper();
        int vowelCount = stringHelper.countVowels("Hello World Java");
        System.out.println(vowelCount);
    }
}
