import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k,n,w;
        k=sc.nextInt();
        n=sc.nextInt();
        w=sc.nextInt();
        int c=0;
        for(int i=1;i<=w;i++){
            c=c+k*i;
                     
        }
        if(c>n){
            System.out.println(c-n);
        }
        else{
            System.out.println(0);
        }
    }
}
Input 

3 17 4
Output 

13