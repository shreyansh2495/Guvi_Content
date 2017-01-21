import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class shortestNumber{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long number =  sc.nextLong();
        String num = ""+number;
        char ch[] = num.toCharArray();
        int K = sc.nextInt();
        for(int i=0; i<K; i++){
            long max = -1;
            int maxpos=-1;
            for(int j=0; j<ch.length; j++){
                if(ch[j]!='x')
                if(Integer.parseInt(""+ch[j])>max){
                    max = Integer.parseInt(""+ch[j]);
                    maxpos = j;
                }
            }
            if(maxpos!=-1)
                ch[maxpos] ='x';
        }
        
        for(int i=0; i<(ch.length); i++)
            if(ch[i]!='x')
            System.out.print(""+ch[i]);
    }
}
