package Strings2022503567;

import java.util.Arrays;
import java.util.Scanner;

public class EmailValidity {
    public static void main(String[] args) {
        System.out.println("Harikrishnan K S  2022503567");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Email: ");
        String em = sc.nextLine();
        if(em.contains("@")) {
            String[] check = em.split("@");
            String[] domain = check[1].split("\\.");
            if (check[0].length() > 25 ) {
                System.out.println("Invalid username");
            }
            else{
                if(domain[1].equals("com")|| domain[1].equals("in") || domain[1].equals("edu")){
                    System.out.println("Valid E-Mail Address");
                }
                else{
                    System.out.println("Invalid E-Mail Address");
                }
            }
        }
        else {
            System.out.println("Invalid E-Mail Address");
        }
    }
}
