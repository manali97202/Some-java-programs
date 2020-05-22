import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        int x1,x2,x3;
        
        x1=sc.nextInt();
        x2=sc.nextInt();
        x3=sc.nextInt();
        int y1=0;
        int y2=0;
        int y3=0;
        if(x1<x2 && x1<x3){
            y1=x1;
            x1=0;
    }
        else  if(x2<x1 && x2<x3){
                 y1=x2;
            x2=0;
        }
        else  if(x3<x1 && x3<x2){
                 y1=x3;
            x3=0;
        }
         if(x1>x2 && x1>x3){
            y3=x1;
             x1=0;
         }
        else  if(x2>x1 && x2>x3){
                 y3=x2;
                 x2=0;  
        }
        else  if(x3>x1 && x3>x2){
                 y3=x3;
            x3=0;
        }
        if(x1!=0)
            y2=x1;
        
        if(x2!=0)
            y2=x2;
        
        if(x3!=0)
            y2=x3;
        System.out.println((y2-y1)+(y3-y2));

        }
}


Input :
7 1 4

Your Output :
6