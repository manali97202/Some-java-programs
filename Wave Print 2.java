import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int aa[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                aa[i][j]=sc.nextInt();
               
            }
        }
        int k=0;
        for(int i=0;i<m;i++){
            if(k==0){
            for(int j=0;j<n;j++){
               System.out.print(aa[j][i]+" ");
            }k=1;
            }
            else{
                for(int j=n-1;j>=0;j--){
               System.out.print(aa[j][i]+" ");
            }k=0;
            }
        }
        
    }
}


Input :
3 4
1 2 3 4 5 6 7 8 9 10 11 12

Output :
1 5 9 10 6 2 3 7 11 12 8 4