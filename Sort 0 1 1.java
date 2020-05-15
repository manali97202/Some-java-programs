import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
        int a[]=new int[t];
        int z=0;
            int o=0;
        for(int i=0;i<t;i++){
            a[i]=sc.nextInt();
            if(a[i]==0)
               System.out.print(0+" ");
            else if(a[i]==1)
                o=o+1;
            
        }
        
        for(int j=0;j<o;j++){
            System.out.print(1+" ");
        }
        }
}

Input :
7
0 1 1 0 1 0 1

Output :
0 0 0 1 1 1 1 