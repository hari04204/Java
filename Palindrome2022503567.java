package Assignment5;

import java.util.Scanner;

public class Palindrome2022503567 {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            char a = s.charAt(i);
            char b = s.charAt(j);
            if (Character.isLetterOrDigit(a) && Character.isLetterOrDigit(b) && a != b) {
                return false;
            } else {
                if (!(Character.isLetterOrDigit(a))) {
                    j++;
                } else if (!(Character.isLetterOrDigit(b))) {
                    i--;
                } else {
                    continue;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("Harikrishnan K S  2022503567");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();
        String temp = input.toLowerCase();
        if(isPalindrome(temp)){
            System.out.println(input + " true");
        }
        else{
            System.out.println(input + " false");
        }
    }
}
