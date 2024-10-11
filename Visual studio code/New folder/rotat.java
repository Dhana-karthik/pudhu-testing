import java.util.*;
public class rotat{

public static void main(String[] arg ){
int n=10;
    
    char[][] matrix = new char[n][n];
    
 for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
int cut = 65+i+j;
  matrix[i][j]= (char)cut;
      
        }


}

print(matrix);
    rotate(matrix);




}







static void print(char[][] matrix){
int n= matrix.length; 

 for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){

  
       System.out.print(matrix[j][i] +" ");
        }System.out.println();


}
System.out.println("\n\n\n\n");

}
public static void rotate(char[][] matrix) {
    if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
  int rows = matrix.length;
  int cols = matrix[0].length;
  
  for(int first=0,last=rows-1; first<last; first++, last--){
      char[] tmp = matrix[first];
      matrix[first] = matrix[last];
      matrix[last] = tmp;
  }
  print(matrix);
//mirroring the image to left and right 
  for(int i=0;i<rows;i++){
      for(int j=i+1;j<cols;j++){
          char tmp = matrix[i][j];
          matrix[i][j] = matrix[j][i];
          matrix[j][i] = tmp;
      }
  }

   print(matrix);



}







}