import java.util.*;

public class taxi{
static Map<Character, Integer> pointsAndDistances = new HashMap<>();
List<String> availablityOfTaxi =new ArrayList<>();
int earnings=0;
char currentLocation ='A';
static final int speedOfcar = 15; 
static List<Integer> customerId = new ArrayList<>();
static int customerCount=-1;
static void taxi(){

taxi.pointsAndDistances.put('A',0);
taxi.pointsAndDistances.put('B',15);
taxi.pointsAndDistances.put('C',30);
taxi.pointsAndDistances.put('D',45);
taxi.pointsAndDistances.put('E',60);
taxi.pointsAndDistances.put('F',75);

}

static void setavailablityOfTaxi(taxi taxiObject){
 
    for(int i=0;i<24;i++){
        if(i>=6 && i<=20){
        taxiObject.availablityOfTaxi.add("available");
        }else{
            taxiObject.availablityOfTaxi.add("notavailable");
        }

}
}

static void bookingTaxi(char reportingPoint,char droppingPoint , int pickuptime ){




}





}