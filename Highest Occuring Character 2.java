import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int c=0;
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++){
             c=0;
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    c=c+1;
                }
            }
            a[i]=c;
            
        }
        int m=a[0];
        int k=0;
        for(int i=1;i<s.length();i++){
            if(m<a[i]){
                m=a[i];
                k=i;
            }
        }
        System.out.println(s.charAt(k));
        
    }
}

Input :
abdefgbabfba

Your Output :
b