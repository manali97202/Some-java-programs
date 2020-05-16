import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int c=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ')
                c=c+1;
        }
        System.out.println(c);
    }
}


Input :
this is a sample string

Output :
5