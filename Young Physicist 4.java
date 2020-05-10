import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int c=0;
        int xi=0,yi=0,zi=0;

        for(int i=0;i<t;i++){
            xi=xi+sc.nextInt();
            yi=yi+sc.nextInt();
            zi=zi+sc.nextInt();
            
            
        }
        if(xi==0 && yi==0 && zi==0){
            System.out.println("YES");
        }
        else{System.out.println("NO");}
    }
}

Input 

3
4 100 7
-2 4 -1
100 -50 -3

Output

NO