
import java.util.*;
public class palindrome {
    public static void main (String[] arg ){

        String str = "kiik";
int count=0;
        for(int i=0;i<str.length();i++){
           if(str.charAt(i)!=str.charAt(str.length()-1-i)){
            count++;
            System.out.print("the word \" "+str +"\" not a palindrome ");
            break;
           }
        }if(count==0){
            System.out.print(str +" is a palindrome");
        }

    }
}