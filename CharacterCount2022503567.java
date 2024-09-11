package Assignment5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount2022503567 {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Harikrishnan K S 2022503567");
        System.out.print("Enter String: ");
        String input = sc.nextLine();
        for(int i = 0; i < input.length(); i++){
            char c = input.charAt(i);
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey()+" : "+entry.getValue()+ "\t");
        }
    }
}
