package Strings2022503567;

import java.util.Locale;
import java.util.Scanner;

public class Dictionary2022503567 {
    public static void main(String[] args) {
        System.out.println("Harikrishnan K S 2022503567");
        String[][] dict = {{"java","Pure object oriented programming language by James Gosling."},
                {"c++","Object Oriented programming language by Stroustrup"},
                {"python","High-level, general-purpose programming language by Guido van Rossum"},
                {"c", "General-purpose programming language by Dennis Ritchie"},
                {"swift", "High-level general-purpose, multi-paradigm, compiled programming language by Apple"}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PL: ");
        String pl = sc.nextLine();
        int flag = 0;
        for(String[] s: dict){
            if(s[0].equals(pl.toLowerCase())){
                System.out.println(s[0] + " -> " + s[1]);
                flag = 1;
            }
        }
        if (flag == 0){
            System.out.println("Invalid Programming Language or not in Dictionary");
        }
    }
}
