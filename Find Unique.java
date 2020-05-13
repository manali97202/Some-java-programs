import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=i;j<n;j++){
                if(a[i]==a[j]){
                    c=c+1;
                }
            }
            if(c==1){
                System.out.println(a[i]);
                break;
            }
        }
    }
}

Input:
7
2 3 1 6 3 6 2

Output :
1