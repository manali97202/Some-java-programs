import java.io.*;
import java.util.*;

public class Solution {
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int  k=sc.nextInt();
        int r=sc.nextInt();
        int s=k%10;
        int c=0;
        while(s!=r){
            
            s=s+(k%10);
            s=s%10;
            c=c+1;
            if(s==0){
                break;
            }
          // System.out.println(c);  
        }
        System.out.println(c+1);
    }
}


Input :
117 3

Your Output :
9