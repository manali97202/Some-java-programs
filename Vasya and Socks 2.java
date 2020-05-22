import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int s=0;
        while(n>0){
            s=s+n;
            n=n/m;
            
        }
        System.out.println(s);
    }
}

Input :
2 2

Output :
3