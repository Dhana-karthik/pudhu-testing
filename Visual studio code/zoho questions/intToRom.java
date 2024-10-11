import java.util.*;
public class intToRom{

public static void main(String[] arg ){

Map<Integer ,String> map = new HashMap<>();
int num= 9;
map.put(1000,"M");
map.put(900,"CM");
map.put(500,"D");
map.put(400,"CD");
map.put(100,"C");
map.put(90,"XC");
map.put(50,"L");
map.put(40,"XL");
map.put(10,"X");
map.put(9,"IX");
map.put(5,"V");
map.put(4,"IV");
map.put(1,"I");
int[] val =new int[]{1000,900,500,400,100,90,50,40,10,9,5,4,1};
String res="";
for(int i =0;i<val.length;i++){
if(num>=val[i]){
    int count = num/val[i];
    num=num%val[i];
     for (int k=0;k<count;k++){
        res += map.get(val[i]);
     }
}

}
romToInt("DVII");
System.out.println(res);
}


static void romToInt(String roman){

Map<Character , Integer > map = new HashMap<>();

map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);
    int res =0;
for(int i=0 ;i+1<roman.length();i++){

    if(map.get(roman.charAt(i))<map.get(roman.charAt(i+1))){
         res=res + map.get(roman.charAt(i+1))-map.get(roman.charAt(i));

    }else{
 res=res + map.get(roman.charAt(i));

    }
}
res+=map.get(roman.charAt(roman.length()-1));


System.out.println(res);

}


}