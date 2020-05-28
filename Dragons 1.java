import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            int xi=sc.nextInt();
            int yi=sc.nextInt();
            if(s>xi){
                c=c+1;
                s=s+yi;
                
            }
            else{ break;}
            
        }
        if(c==n){
            System.out.println("YES");
            
        }
        else{ System.out.println("NO");}
        
    }
}

Input :
2 2
1 99
100 0

Output :
YES