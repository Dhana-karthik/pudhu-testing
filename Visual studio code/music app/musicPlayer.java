import java.util.*;

public class musicPlayer{

static ArrayList<String> availableSongs = new ArrayList<>();
static ArrayList<String> songHistory = new ArrayList<>();
static int currentSongId;

musicPlayer(){
availableSongs.add("edho vanilai marudhey ");
availableSongs.add("Tirunelveli alva da ");
availableSongs.add("mayakam inna ");
availableSongs.add("Chola chola ");
availableSongs.add("Alaporan Thamizan");
availableSongs.add("Na ready dha");
}

static void playSong(int songIndex)  {
    currentSongId=songIndex;
 String nowPlaying =    availableSongs.get(currentSongId);
    System.out.println("Currently playing :"+nowPlaying);
    songHistory.add(nowPlaying);
    //Thread.sleep(1000);
     System.out.println(" the song ended :"+nowPlaying);
    
}
 
static void allSongs(){
int i=0;
    while(i<availableSongs.size()){
 System.out.println(i+1+". "+availableSongs.get(i));
       
i++;
    }

}

static void deleteCurrentsong(String currentSong ){

availableSongs.remove(availableSongs.indexOf(currentSong));
System.out.println("the song "+currentSong+" deleted successfully ");

}

static void playPreviousSong(){
String lastSongInHistory =songHistory.get(songHistory.size()-1);
   System.out.println(  songHistory.get(songHistory.size()-1)  );
   songHistory.remove(songHistory.indexOf(lastSongInHistory));

}
static void toQuit(){

    currentSongId=-1;
}


}


