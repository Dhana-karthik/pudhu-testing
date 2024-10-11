import java.util.*;
public class tollgate{
    Map<Integer,Integer> vechicleNumberList = new HashMap<>();
int tollNumber;
static int normalTax = 1000;
static int[] taxType = new int[]{1000,800};
int amountCollected;
static void vehiclesEntry(vehicle object ,tollgate tollObject){
 
    tollObject.vechicleNumberList.put(object.vehicleNumber,tollgate.taxType[object.vehicleType]);

}

static int  printTollGateDetails(tollgate object ){
   
    System.out.println(object.vechicleNumberList);
  
    System.out.println();

int totalAmt=0 ;

for(int i=0;i<object.vechicleNumberList.size();i++){
  totalAmt  += object.vechicleNumberList.get(i);
}


return totalAmt ;
}


}