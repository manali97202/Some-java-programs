import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int l=(2*n+1)/2;
        int m=2*n;
        for(int i=0;i<n;i++){
            
            for(int j=0;j<(2*n+1);j++){
                if(j==k || j==l || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print("0");
                }
                
            }
           //System.out.print(" "+k+" "+l+" "+m);
            k=k+1;
            m=m-1;
            System.out.println();
        }
    }
}


Input :
3

Output :
*00*00*
0*0*0*0
00***00