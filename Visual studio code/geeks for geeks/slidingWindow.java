import java.util.*;
public class slidingWindow{
    public static void main(String[] args) {
     
        System.out.println(slidingWind("hlweeeedfgvsdfgwf"));
    }

static int slidingWind(String str){
int left =0,right=1,max=0;
Set<Character> h = new HashSet<>();
while(right<str.length()  && left <= right ){



    while(h.contains(str.charAt(right))){
        h.remove(str.charAt(left));
        left++;
    }
    h.add(str.charAt(right));
    
    if(max<right - left+1){max=right - left+1;}
    right++;
}
    return max;
}


}