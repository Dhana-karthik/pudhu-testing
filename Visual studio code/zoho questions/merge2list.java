import java.util.*; 
public class merge2list{

public static void main(String[] args) {
    
   System.out.println( isPathCrossing("NNS"));
}
public static boolean isPathCrossing(String path) {
        
    ArrayList<Integer> xList = new ArrayList<>(); 
    ArrayList<Integer> yList = new ArrayList<>();
 int x=0,y=0;
 
 for(int i=0 ;i<path.length();i++){
 
 char ch = path.charAt(i); 
 
 if(ch=='N'){
     y=y+1;  
 }
 else if(ch=='S'){
      y=y-1;  
 }
 
 if(ch=='E'){
     x=x+1;
    
 }else if(ch=='W'){
     x=x-1;
     
 }
 
 if( xList.contains(x) && yList.contains(y) && xList.indexOf(x) == yList.indexOf(y)   ){
 return true;
 
 }else{
 xList.add(x);
 yList.add(y);
 }
 
 
 }
 
 return false;
 
 
 
 
 
 
 
 
 
 
         
     }
 
}