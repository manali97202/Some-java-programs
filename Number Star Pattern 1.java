import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=1;
        for(int i=0;i<n;i++){
            
            for(int j=n;j>0;j--){
                if(j==k){
                    System.out.print("*");
                }
                else{
                System.out.print(j);
                }
                
            } 
            k=k+1;
            System.out.println();
        }
        
    }
}

Input :

5

Output :

5432*
543*1
54*21
5*321
*4321