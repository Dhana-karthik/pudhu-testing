import java.util.*;
public class Main{
public static void main(String[] arg){

 

Scanner sc = new Scanner(System.in);

boolean loop = true ;
while (loop){
    System.out.println("\n" + "1. to quit\n" + "2. to play next song \n" + "3. to previous song \n" + "4. to replay current song \n" + "5. list of all song \n" +  "6. print all available songs \n" +  "7. delete current song");
int choice = sc.nextInt();

    switch(choice ){
      case 1:{
        musicPlayer.toQuit();  
        break;
      }
      case 2 :
      { 
         musicPlayer.playSong(musicPlayer.currentSongId +1);
        break;
      }
      case 3:{
        

        
        break;
      }

    }

}





}
}