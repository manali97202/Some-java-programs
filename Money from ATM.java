import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x,y;
        x=sc.nextDouble();
        y=sc.nextDouble();
        if(x>y){
            System.out.printf("%.2f",y);
            
        }
        else if(x%5==0){
            System.out.printf("%.2f",y-x-0.50);
        }
        else
        System.out.printf("%.2f",y);
       
    }
}

Input 

30 120.00
Output 

89.50