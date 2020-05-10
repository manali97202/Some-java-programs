import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char a[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            a[i]=s.charAt(i);
            if(Character.isLowerCase(s.charAt(0))) {    
                //Convert it into upper case using toUpperCase() function    
                a[0]= Character.toUpperCase(s.charAt(0));    
            }    
            System.out.print(a[i]);
        }
    }
}

Input:

ApPLe
Output:

ApPLe