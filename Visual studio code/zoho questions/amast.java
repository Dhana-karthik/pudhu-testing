import java.util.*;
//import java.math.*;
//import java.lang.*;
import static java.lang.Character.*;

public class amast{

public static void main(String[] arg ){

 
String number="An";

number = number.toUpperCase();

int res =0;
  
for(int i=0;i<number.length();i++){

res = res + (int )(number.charAt(i)-64)*(int)Math.pow(26,number.length()-1-i);
}

//System.out.println(res);
int[] arr = new int[]{1,5,3,4,2,9};
rearrangeAlternative(arr);

//amastro(153);

}

/*
 * Amstrong number is something when sum  of all digits with the power of total no. of digits. 
*/

static void amastro (int num ){
    
    int copyNum = num ;
    
    int count =0;
    while (copyNum>0) {copyNum/=10; count++;   }
    copyNum = num ;
    int res =0;
    
    while(num >0){
        res = res + (int) Math.pow(num%10, count );
        num/=10;
    }
    
    if(copyNum== res ){
        System.out.println("It is a amstrong number ");
    }else{
        System.out.println("It is not a amstrong number ");
    }
    
}
/*arrange the sorted array such that where even numbers are filled with 
 * ascending order & odd index elements filed in descending order .
*/


 static void  rearrangeAlternative(int[] arr){
    int n=arr.length;
    int max_index = n-1;
    int min_index = 0;
    int Max = arr[n-1] +1;
    for(int i=0;i<n;i++){
        if(i%2 == 0){
            arr[i] = (arr[max_index] % Max)*Max + arr[i];
            max_index--;
        }
        else{
            arr[i] = (arr[min_index] % Max)*Max + arr[i];
            min_index++;
        }
    }
    for(int i=0;i<n;i++){
        arr[i] /= Max;
    }   
System.out.println(Arrays.toString(arr));
}
}