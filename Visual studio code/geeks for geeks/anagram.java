public class anagram{
    public static void main(String[] args) {
   
      String a = "tamil", b="lmta";

    System.out.println( anagramChecker(a,b));




    }


    static boolean  anagramChecker(String a , String b ){
boolean answer= true ;
int[] value = new int[]{2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103 };

a=a.toLowerCase();
b=b.toLowerCase();
int prodA=1,prodB=1;
for(int i=0;i<a.length();i++){
          prodA=prodA*value[(int) a.charAt(i)-(int)'a']; 
}
for(int i=0;i<b.length();i++){
          prodB=prodB*value[(int) b.charAt(i)-(int)'a'];
     
}
if(prodA!=prodB) answer=false;

return answer;
    }
}