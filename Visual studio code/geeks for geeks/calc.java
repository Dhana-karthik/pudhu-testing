import java.util.Scanner;

public class calc {
public static void main (String [] arg  ){


     Scanner sc = new Scanner(System.in);
     int a,b,choice;

boolean loop = true;

while(loop){
  System.out.println("enter integer A ");
a =   sc.nextInt();
  System.out.println("enter integer B ");
  b = sc.nextInt();
  System.out.println("1. Addition \n2. Substraction \n3. Multiplication \n4. Division \n5. Exit");
choice = sc.nextInt();
  switch(choice ){
    
    case 1:{
      System.out.println(a+b);
    break;}
    case 2:{
      System.out.println(a-b);
    break;}
    case 3:{
      System.out.println(a*b);
   break; }
    case 4: {
      System.out.println(a/b);
      
    break;}
    default:{
      loop = false;
    break;}
  }
  
}     
     


}
     
}