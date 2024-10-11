
import java.util.*;
public class rhombus
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	System.out.println("enter the value here ");
		int n = sc.nextInt();
		
		for(int h=1;h<=n;h++){
		   for(int l=1;l<=n+1-h;l++){
		       System.out.print(" ");
		   }
           
		    for(int l=1;l<=n;l++){
		        System.out.print("*");       
		    }System.out.println();
		}
		
		
		sc.close();
	}
}
