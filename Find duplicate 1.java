import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<t;i++){
          
            int c=0;
            for(int j=i+1;j<t;j++){
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



Input :
9
0 7 2 5 4 7 1 3 6

Output :
7