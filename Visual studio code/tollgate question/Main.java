import java.util.*;

public class Main  {


    public static void main(String[] arg ){

int totalAmountpayed=0;
int count =-1;
        // create objects 
        ArrayList<tollgate> tollGateObjectList = new ArrayList<>();
        ArrayList<vehicle> vechileObjectList = new ArrayList<>();
    int n=6;   
    Scanner sc = new Scanner(System.in);


for(int i=0;i<n;i++){
 tollGateObjectList.add(i, new tollgate());

}
boolean loop = true;

int option =0;
while(loop){
    System.out.println("1. fill details of vehicle \n2. toll gate details\n3. vehicle details ");
    option = sc.nextInt();
switch(option)
     {
case 1:
++count ;
{    vechileObjectList.add(count ,new vehicle());
 vehicle currentVechileObject = vechileObjectList.get( count );
     currentVechileObject.vehicleNumber=count;
     System.out.println("enter if VIP 1 or normal traveller 0");
      currentVechileObject.vehicleType= sc.nextInt();
     
      while (currentVechileObject.vehicleType>1||currentVechileObject.vehicleType<0){
      System.out.println("you entered invalid number");
        currentVechileObject.vehicleType= sc.nextInt();
      }

 System.out.println("enter destinations points in range of : 0"+(n-1));
      currentVechileObject.startingpoint=sc.nextInt();
     currentVechileObject.endingPoint=sc.nextInt();
      
     

      if(n/2 +1 <  currentVechileObject.endingPoint -currentVechileObject.startingpoint ){
       
      for(int i=currentVechileObject.startingpoint;i>=0;i--){
        currentVechileObject.tollGatesPassedList.add(i);
         tollgate.vehiclesEntry(currentVechileObject,tollGateObjectList.get(i));
      currentVechileObject.amountPaid+=tollgate.taxType[currentVechileObject.vehicleType];
      System.out.println(currentVechileObject.amountPaid);
        }
      for(int i=n;i>=currentVechileObject.endingPoint;i--){
        currentVechileObject.tollGatesPassedList.add(i);
         tollgate.vehiclesEntry(currentVechileObject,tollGateObjectList.get(i));
         currentVechileObject.amountPaid+=tollgate.taxType[currentVechileObject.vehicleType];
      System.out.println(currentVechileObject.amountPaid);
        }
      
      }else{
for(int i=currentVechileObject.startingpoint;i<currentVechileObject.endingPoint;i++){
     currentVechileObject.tollGatesPassedList.add(i);
      currentVechileObject.amountPaid  +=tollgate.taxType[ currentVechileObject.vehicleType];
      tollgate.vehiclesEntry(currentVechileObject,tollGateObjectList.get(i));
      
     System.out.println(currentVechileObject.amountPaid);
}
System.out.println("your vehicle reached final destination of " +currentVechileObject.endingPoint);
      }
    break;
}

case 2:
int totalAmountAllTolls=0;
{   for(int i=0 ;i<n;i++){
   totalAmountAllTolls+= tollgate.printTollGateDetails(tollGateObjectList.get(i));
}
System.out.println("Total amount collected by all tollgates is :"+totalAmountAllTolls);
    break;
}
case 3:
{ 
    for(int i=0;i<vechileObjectList.size();i++){
    vehicle.printVehicleDetails(vechileObjectList.get(i));
    }
    break;
}

case 4:{
    loop=false ;
    break;
}
default:{
    System.out.println("Invalid input ");
break;
}

     }




}





        }

}