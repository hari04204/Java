package Assignment5;

import java.util.Scanner;

public class Good2022503567 {
    static public void main(String[] args) {
        System.out.println("Harikrishnan K S   2022503567");
        String input = new String();
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        String[] slicedInput = input.split(" ");
        int notIndex = -1;
        for(int i = 0; i<slicedInput.length; i++){
            if(slicedInput[i].toLowerCase().equals("not")) notIndex = i;
        }
        int badIndex = -1;
        for(int i = 0; i<slicedInput.length; i++){
            if(slicedInput[i].toLowerCase().equals("bad")) badIndex = i;
        }
        if((notIndex == -1 || badIndex == -1) && badIndex > notIndex){
            System.out.println("Invalid sentence");
        }
        else{
            slicedInput[notIndex] = "good";
            for(int i = notIndex+1; i<slicedInput.length-(badIndex-notIndex);i++){
                slicedInput[i] = slicedInput[i+(badIndex-notIndex)];
            }
            String str = String.join(" ", subArray(slicedInput, slicedInput.length-(badIndex-notIndex)-1));
            str = str + input.charAt((input.length()-1));
            System.out.println(str);
        }

    }
    public static String[] subArray(String[] s, int n)
    {
        // Pick starting point
        String[] res = new String[n];
        for (int i=0; i <n; i++)
        {
            res[i] = s[i];
        }
        return res;
    }
}
