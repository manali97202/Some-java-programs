import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        String a[]=new String[n+1];
        for(int i=1;i<=n;i++){
            a[i]=sc.next();
            int c=0;
            int k=0;
            for(int j=1;j<i;j++){
                
                if(a[i].equals(a[j])){
                    k=k+1;
                }
                //System.out.println(a[i]+" "+a[j]+" "+k);
            }
            if(k>0){
                System.out.println(a[i]+k);
            }
            else{
                k=k+1;
                System.out.println("OK"+" ");
            }
            
        }
    }
}


Input :
4
abacaba
acaba
abacaba
acab

Output :
OK 
OK 
abacaba1
OK 