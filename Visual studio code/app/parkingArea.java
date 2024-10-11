import java.util.*;
public class parkingArea{

int[] timeSlot = new int[24];


ArrayList<String> nameAndTimeSlot = new ArrayList<>(); 

int price ;
  parkingArea(){
for(int i=0;i<24;i++){
// if 1 the time slot is occupied if 0 free at that time 
timeSlot[i]=0;
}

}


static boolean  checkSlot(parkingArea object , int startTime , int endTime  ){


return true;
}


static boolean  book(parkingArea object,int startTime , int endTime,String name , double paymentCost  ){

for(int i =startTime-1; i<endTime;i++ ){
if(object.timeSlot[i]==1) {System.out.println("you entered occupied slot re-enter again");       return true ;} 
}

String timeSlotstring = "Name : "+name +"starttime "+startTime+" end time "+endTime+" cost  : "+paymentCost;
object.nameAndTimeSlot.add(timeSlotstring );
for(int i=startTime -1; i<endTime;i++ ){
object.timeSlot[i] =1; 

}


System.out.println("payement sucessful");
System.out.println("Your car parking slot alloted " );
return false;
}


static void printDetails(parkingArea object ){


for(int i=0;i<24;i++){

System.out.println("time in hrs"+(i+1)+""+ ((object.timeSlot[i]==1)? " reserved":" free") );

}
System.out.println("customer details :");

for(String str : object.nameAndTimeSlot){if( object.nameAndTimeSlot.size()==0) { System.out.println(0 ); break;}
  System.out.println(str );
}
} 



}