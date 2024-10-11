import static java.lang.Character.*;

import java.util.*;
public class main{


    public static void main(String[] arg){

    boolean loop = true;
Scanner sc = new Scanner(System.in);

while(loop){
    System.out.println("Hotels : \n1. buhari \n2. A&B \n3. SS. Hydrabad \n4. Amma canteen ");
    

    int input = sc.nextInt();

if(input==1){// bubari
System.out.println("menu \n1. Biriyani \n2. Chcicken 65 \n3. chicken lolipop");

}else if(input==2){//A&B
    System.out.println("menu \n1. idli \n2. dosa \n3. poori");
}else if (input==3) {// sshydrabad biriyani
    System.out.println("menu \n1. SS. hydrabad biriyani \n2. special tantori \n3. bread halwa");
}else if(input==4){// amma camteen
System.out.println("\nmenu \n1. idli \n2. vada \n3. pongal");
}else{
    loop=false;
}
}






    }
}