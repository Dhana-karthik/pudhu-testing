import java.util.*;
public class vehicle{


 int vehicleType = 0;// 0-> normal 1-> VIP USER 
int vehicleNumber ;  
ArrayList<Integer> tollGatesPassedList = new ArrayList<>();
int startingpoint ;
int endingPoint ;

int amountPaid;

static void printVehicleDetails(vehicle object ){

    System.out.println( "Vechicle number "+object.vehicleNumber+" vehicle Type: "+object.vehicleType+" Starting tollgate "+object.startingpoint +"ending tollgate :"+object.endingPoint+"The total amount payed "+object.amountPaid+"\n List of toll gates it went through"+object.tollGatesPassedList );

}

}