package Strings2022503567;

import java.util.Scanner;

public class versionCompare2022503567 {
    public static void main(String[] args) {
        System.out.println("Harikrishnan K S  2022503567");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String s1 = sc.nextLine();
        System.out.print("Enter String 2: ");
        String s2 = sc.nextLine();
        if(compareVersions(s1,s2)==1){
            System.out.println("Version "+ s1 +" is greater than "+ s2 +" .");
        }
        else{
            System.out.println("Version "+ s2 +" is greater than "+ s1 +" .");
        }
    }
    static public int compareVersions(String s, String t){
        String[] s1 = s.split("\\.");
        String[] s2 = t.split("\\.");
        for(int i = 0; i < Math.min(s1.length, s2.length); i++){

            if(Integer.parseInt(s1[i]) > Integer.parseInt(s2[i])){
                return 1;
            } else if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[i])) {
                return -1;
            }
        }
        return 0;
    }
}
