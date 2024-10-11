import java.util.*;

public class Main{

public static void main(String[] arg){
 boolean slotStatus=true;
ArrayList<parkingArea> objectList = new ArrayList<>();


for(int i=0;i<5 ;i++){

    objectList.add(new parkingArea());

}
System.out.println(objectList.size());

Scanner sc= new Scanner(System.in);


boolean loop =true;

while(loop){System.out.println("1. book \n2. details ");
    int option = sc.nextInt();
    switch(option)
    {
   case 1:{
    System.out.println("enter the parking area id , ");
    int i = sc.nextInt(); 
    

 System.out.println(" start time ending time,enter your name ");
int startT = sc.nextInt();
    int endT = sc.nextInt();
    String name = sc.next();
    System.out.println("the total cost :"+(endT - startT)*500);
    double cost = (endT - startT)*500;
   while (slotStatus ){
     slotStatus =  parkingArea.book(objectList.get(i),startT,endT,name,cost);
   }
    break;
   }

   case 2:{
     System.out.println("enter the parking area id , ");
    int i = sc.nextInt(); 
   parkingArea.printDetails(objectList.get(i));
    
    break;
   }



   default:{
    loop = false;
    break;
   }
}




}



}


}