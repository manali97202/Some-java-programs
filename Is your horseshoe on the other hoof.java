import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a[]=new int[4];
        int c=0;
        for(int i=0;i<4;i++){
            a[i]=sc.nextInt();
            int j=0;
            while(j<i){
                if(a[j]==a[i]){
                    c=c+1;
                a[j]=0;
                    }
              //  System.out.println(a[i]+" "+a[j]+"-->"+c);
                j=j+1;
            }
        }
        
        
        System.out.println(c);
    }
}


Input :
1 7 3 3

Output :
1