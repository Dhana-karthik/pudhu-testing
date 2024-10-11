public class kadaneAlgo{

}


class Solution{

// Arr[] = {1,2,3,-2,5}
    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int arr[], int n){
        
        // Your code here
        long max =0;
        int currentSum=0;
        for(int i=0;i<n;i++) max = Math.max(arr[i], max);
        for(int i =0 ;i<n ; i++){
        if(currentSum<0) currentSum=0;
           
        currentSum+=arr[i];
      
        max =  Math.max(max,currentSum);
        }
        
      return   max ;
    }
    
boolean isPrime(int number ){


boolean result =false;
int count =0;
for(int i =2;i<number;i++ ){
    if(number%i==0){count++; break;}
}

if(count==0) result = true ;

return result ;



}

void primeRange(int num ){
int count =0;
for(int i=3;i<num ;i++){
for(int j=2;j<i;j++){
    if(i%j==0){count++;}

}  if(count==0) System.out.println(i);



}



}

}

