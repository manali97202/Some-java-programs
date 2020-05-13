import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){ 
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
                else{c=c+1;}
                
            }
        }
        if(c==m*n){
            System.out.println(-1);
        }
        
       
    }
}


Input :
6
2 6 8 5 4 3
4
2 3 4 7

Output :
2
4
3