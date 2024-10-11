import java.util.*;
public class pattern {
public static void main(String[] arg ){


    Scanner sc = new Scanner(System.in);

int  n =sc.nextInt();
char ch =64;
for(int j=0;j<n;j++){ ch++; 
for(int i=0;i<n;i++){
if( i<j){

System.out.print("*");

}else{
     System.out.print(" ");
}

}System.out.println();
}
sc.close();
}
}