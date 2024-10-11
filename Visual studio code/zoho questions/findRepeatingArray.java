import java.util.ArrayList;
import java.util.HashSet;

public class findRepeatingArray{
public static void main(String[] arg ){
long num =328;
   
  
   
    System.out.println(isSumPalindrome(num) );
}


static long isSumPalindrome(long num){
    
          long revnum=0,number;
         
         int i =1;
      while (i<=5 ){
        
        number=num;
        revnum = 0;
         while(number > 0){
               
             revnum = revnum*10+number%10;
        
             number=number/10;
         
             
         }
    
         if(num==revnum ) {
           
           break;
         
         
             
         }
         else{
               
                 num = num+revnum; 
         }
         
          i++; 
          
          if(i==5 && !(num ==revnum)) {num =-1; break;}
          
      }
      
       
       return num ; //System.out.println(num );
    }






//***************************************************************************************************************************************** */







 public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list2 = new ArrayList<>(); 
       HashSet<Integer> check = new HashSet<>();
       HashSet<Integer> list = new HashSet<>();
      int sizeBeforeAdding;
    //   int a=1;
     for(int i=0;i<n;i++){
         
        sizeBeforeAdding = check.size();
         check.add(arr[i]);
         if(sizeBeforeAdding == check.size() ){
             list.add(arr[i]);
         }
         
     }  
       list2.addAll(list);
       return list2;
    }

}