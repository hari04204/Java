package Assignment5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Pangram2022503567 {
    public static void main(String[] args) {
        boolean[] alpha = new boolean[26];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String input = sc.nextLine();
        input = input.toLowerCase();
        for(int i = 0; i < input.length(); i++){
            if(!Character.isAlphabetic(input.charAt(i))){
                continue;
            }
            else{
                alpha[input.charAt(i)-'a'] = true;
            }
        }
        char[] missing = new char[26];
        int index = 0;
        for(int i = 0; i<alpha.length; i++){
            if(alpha[i] == false){
                int i1 = (char) i + 'a';
                missing[index] = (char) i1;
                index++;
            }
        }
        int flag = 0;
        for(boolean b: alpha){
            if(b==false){
                flag = 0;
                break;
            }
            else{
                flag =1;
            }
        }
        if(flag == 0){
            System.out.print("No, the given string is not a Pangram. \t Missing Letters: ");
            for (int i = 0; i<index; i++){
                System.out.print(missing[i]+" ");
            }
        }
        else{
            System.out.println("Yes, the given string is a Pangram.");
        }

    }
}
