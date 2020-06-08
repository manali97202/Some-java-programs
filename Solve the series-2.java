import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        int c=0;
        for(int i=2;i<=n;i++){
            c=a+i*i*i*i;
            a=c;
        }
        System.out.println(c);
        
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

Input :
6
Your Output :
2275