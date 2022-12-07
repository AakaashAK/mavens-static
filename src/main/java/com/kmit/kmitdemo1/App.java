package com.kmit.kmitdemo1;
import java.util.*;
class SwitchGame{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(ss(s));
    }
    public static List<String> ss(String s){
        List<String>l=new ArrayList<>();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='+' && s.charAt(i+1)=='+')
            {
                String s1="";
                if((i+1)!=s.length()-1)
                    s1=s.substring(0,i)+"--"+s.substring(i+2);
                else{
                    s1=s.substring(0,i)+"--";
                }
                l.add(s1);
            }    
        }
        return l;
    }
}