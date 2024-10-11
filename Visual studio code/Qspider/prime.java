import java.util.*;

public class prime{
public static void main(String[] arh){
    int[] ar = {7,1,5,3,6,4};
   
int n =20;
n=n/2;
for(int i=-n;i<=n;i++){
for(int j =-n;j<=n;j++){

if(Math.abs(j) +Math.abs(i) >=n ){
    System.out.print(" ");
}else{ System.out.print("*");}

} System.out.println();


}








}

    public boolean isPalindrome(String s) {
    
        return true ;
    }

    public static int maxProfit(int[] prices) {
        int maxProfit=0,left=0,right=1;
        while(left<right && right<prices.length){
       
        if(prices[right]-prices[left]<0){
            left++;right++;
        }else if(prices[right]-prices[left]>0){ 
               maxProfit= Math.max(maxProfit,prices[right]-prices[left]);

              right++;
        }
        }
        return maxProfit;
    }


}