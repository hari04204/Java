package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class FrequencyCounter2022503567 {
    public static void main(String[] args) {
        System.out.println("Harikrishnan K S   2022503567");
        String input = new String();
        String target = new String();
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        String[] slicedInput = input.split("[,. ?]+");
        System.out.print("Enter target String: ");
        target = sc.nextLine();
        System.out.println(Arrays.toString(slicedInput));
        int count = 0;
        for(int i = 0; i<slicedInput.length; i++){
            if(target.equals(slicedInput[i])){
                count++;
            }
        }
        if(count == 0) System.out.println("The target string wasn't found in the sentence.");
        else System.out.println("The target was found in sentence " + count + " times.");
    }
}
