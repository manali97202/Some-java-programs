import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static int reverse(int n){
            int reverse=0;
            
            while(n!=0){
                reverse=reverse*10;
                reverse=reverse+n%10;
                n=n/10;

            }
            return reverse;

    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        
        int sum=0;
        int reverse;
        for(int l=i;l<=j;l++){
            int r=reverse(l);
            
            if((l-r)%k==0){
                sum=sum+1;
            }
          

        }
        return sum;


    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        int j=sc.nextInt();
        int k=sc.nextInt();
        System.out.println(beautifulDays(i,j,k));

    }
}

Input :
20 23 6

Output :
2