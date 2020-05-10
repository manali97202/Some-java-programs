import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c1=0;
        for(int i=0;i<t;i++){
            int p,v,to;
            p=sc.nextInt();
            v=sc.nextInt();
            to=sc.nextInt();
            int c=0;
            if(p==1){
                c=c+1;
            }
            if(v==1){
                c=c+1;
            }
            if(to==1){
                c=c+1;
            }
           // System.out.println(c);
            if(c>=2){
                c1=c1+1;
            }
            
            
        }
        System.out.println(c1);
    }
}



Input:3
1 1 0
1 1 1
1 0 0

Output:2