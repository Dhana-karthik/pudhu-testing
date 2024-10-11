import java.util.*;

public class noob{
    public static void main(String[] arg ){
Scanner sc = new Scanner(System.in);
String input = sc.next();
    System.out.println(remmoveDuplicates(input));
    }



     static ArrayList<Integer> snakePattern(int matrix[][])
    {
        
       ArrayList<Integer > result = new ArrayList<>(); 
        for(int row =0 ;row<matrix.length;row++ ){
            if(row%2==0){
             
              for(int column=0 ;column<matrix[0].length;column++){
               result.add(matrix[row][column ]);
                
              }


            }else if(row%2!=0){
for(int column=matrix[0].length-1 ;column>=0;column--){
               result.add(matrix[row][column ]);
                
              }

            }



        }
return result;
    }





    static String remmoveDuplicates(String variable ){
     String uniqueString ="";
        Character[] letters = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     ArrayList<Character> letter = new ArrayList<>();
     for(int i=0;i<letters.length;i++){
        letter.add(letters[i]);
     }
     for(int i=0;i<variable.length();i++){


        if(letter.contains(variable.charAt(i))){
            uniqueString=uniqueString+variable.charAt(i);
        letter.remove(letter.indexOf(variable.charAt(i)));
        }
     }


        return uniqueString;
    }


    static int longestSubstrDistinctChars(String s){
    int size=0;
Character[] letters = new Character[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
     ArrayList<Character> letter = new ArrayList<>();
     for(int i=0;i<letters.length;i++){
        letter.add(letters[i]);
     }

for(int i=0;i<s.length();i++){


}


        return size;
        
    }




}