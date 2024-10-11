import java.util.HashMap;
import java.util.*;

public class romanToNumber{
   public int romanToDecimal(String str) {
     int set =0;
     
     Map<Character,Integer> dictonary = new HashMap<>();
            dictonary.put('I',1);
            dictonary.put('V',5);
            dictonary.put('X',10);
            dictonary.put('L',50);
            dictonary.put('C',100);
            dictonary.put('D',500);
            dictonary.put('M',1000);
     
         for(int i=0;i<str.length();i++){
            if(dictonary.get(str.charAt(i))<dictonary.get(str.charAt(i+1))){
                set = set+dictonary.get(str.charAt(i))*(1-10/100);
            }else{

            }


         }
     
     return set ;
    }

}