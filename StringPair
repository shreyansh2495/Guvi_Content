import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class StringPair{
    
    
    
    
    public static void main(String[] args){
     
        Scanner sc = new Scanner(System.in);
        String a =  sc.nextLine();
        String b = sc.nextLine();
        
        char cha[] = a.toCharArray();
        char chb[] = b.toCharArray();
        int value = 0;
        int d = 0;
        int i = 0;
        int r = 0;
        if(cha.length<=chb.length){
        
        for(int s=0; s<cha.length-1; s++){
            char search = chb[s];
            if(cha[s]!=search){
                if(cha[s+1]==search&&cha[s+1]!=chb[s+1]){
                    //del
                    for(int k=s; k<cha.length-1; k++)
                    cha[k]=cha[k+1];
                    cha[cha.length-1]='-';
                    value = value+3;
                    d++;
                    System.out.println(""+d+" "+cha[s]+" "+s+" "+cha[s+1]+" "+chb[s+1]);
                }else
                if(cha[s]=='-'){
                    //Insert
                    cha[s]=search;
                    value = value+4;
                    i++;
                }else            
                {
                    //replace
                    cha[s]=search;
                    value = value+5;
                    r++;
                }
            }
        }
        
            int s = cha.length-1;
            char search = chb[s];
            if(cha[s]=='-'){
                //Insert
                cha[s]=search;
                value=value+4;
                i++;
            }
            else{
               if(cha[s]!=search){
                   //Replace
                   cha[s]=search;
                   value=value+5;
                   r++;
               }
            }
            
            String sa="";
            for(int in=0; in<cha.length; in++)
                sa = sa+cha[in];
        
            for(int in=cha.length; in<chb.length; in++){
                //Insert
                sa = sa + chb[in];
                value=value+4;
                i++;
            }
            
             char chans[] = sa.toCharArray();
        
        for(int in=0; in<chans.length; in++)
             if(chans[in]!='-')
            System.out.print(""+chans[in]);
        System.out.println("");
        for(int j=0; j<chb.length; j++)
              System.out.print(""+chb[j]);
            
        System.out.println("\nMinimum Cost "+value+"\nNo of Delete Operations "+d+"\nNo of Insert Operations "+i+"\nNo of Replace Operations "+r);
        }
                
       
    }
}
