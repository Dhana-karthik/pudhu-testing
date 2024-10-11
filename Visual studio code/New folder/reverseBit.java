public class reverseBit{

    public static void main(String[] ar){
     
       
System.out.println(revBit(67));


    }


    static int revBit(int ar){
String binStr = Integer.toBinaryString(ar);

    int n =binStr.length();
System.out.println(binStr);
String result="";

   for(int i=n-1;i>=0;i--){
     
    result += binStr.charAt(i);
   }

System.out.println(result);

        return   Integer.parseInt(result,2); 
    }


}