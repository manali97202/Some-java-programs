import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=0;
        int b=7;
        int c=0;
        int d=7;
        for(int i=3;i<=n;i++){
             d=d+4;
            c=d+b;
            b=c;
            
            
        }
        System.out.println(c);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

Input :
6

Output :
75