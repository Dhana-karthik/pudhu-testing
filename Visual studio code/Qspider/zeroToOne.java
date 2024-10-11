public class zeroToOne{
    public static int convertFive(int n){
        //add code here.
        int repInt=0;
        while (n>0){
            
                repInt = repInt*10 + n%10;
            
            n/=10;
            
        }
        
        int answer=repInt;
        
        
        
        return answer;
        }
        static int minJumps(int[] arr){
            // your code here
            int i=0;
            int res=0;
            while(i<arr.length){
                
                i = i+arr[i];
                res++;
                if(arr[i]==0){return -1;}
                
            }
            
                
           return res;  
        }


        public static void main(String[] arg){
            int[] arr= {1 ,3 ,5, 8 ,9 ,2 ,6 ,7 ,6 ,8, 9};
System.out.println();
   

        }
}