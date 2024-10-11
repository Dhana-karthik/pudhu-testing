import java.util.*;
public class practice {

public static void main (String [] arg ){
boolean gril=true ;
int i=3,j=1,count=1;
int k =0;
int[] arr=new int[26];
arr[0]=2;boolean run =true;
while(i>j ){
for(j=1;j<i;j++){
if(  i%j==0 ){
count++;


}

}
if(count==0){arr[k]=i;}
i+=2;    
}

System.out.println(Arrays.toString(arr));
}
}