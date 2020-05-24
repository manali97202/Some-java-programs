import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            int c=0;
            for(int j=1;j<=a[i];j++){
                if(a[i]%j==0){
                   c=c+1; 
                }
            }
            if(c==3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
   
    }
}


Input :
3
4 5 6

Output :
YES
NO
NO