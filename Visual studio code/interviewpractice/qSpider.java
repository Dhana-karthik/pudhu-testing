import java.util.*;

public class qSpider{

public static void main(String[] arg)
{
String ipAd= "222.111.111.111";

Scanner sc = new Scanner(System.in);
char ch ='0';
int  result =1;
int d=ch;
int check =0;
System.out.println(d);
 int rangeCheck=0;

int getFirst =0;

for(int i=1;i<ipAd.length()-1;i++){



if(ipAd.charAt(0)=='0'||ipAd.charAt(0)=='.' ) {result = 0; break; } 
if(ipAd.charAt(i)!='.'  ) {
getFirst = getFirst*10+ (int) ipAd.charAt(i);
if(getFirst<0 || getFirst>255) { result=0; break;}
}


if( ipAd.charAt(i) =='.' && ipAd.charAt(i+1)=='0' ){
  result=0; break;      }





}






  }
}

