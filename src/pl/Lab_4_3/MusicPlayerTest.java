package pl.Lab_4_3;

public class MusicPlayerTest {

    public static void main(String[] args) {
        MusicPlayer mp3 = new MP3_Player("Player 1");
     mp3.show();
     mp3.loadPlaylist();
     mp3.play();
     mp3.pause();

        MusicPlayer cd = new CD_Player("Player 2");
        cd.show();


        cd.loadPlaylist();
        cd.play();

        cd.next();

        cd.next();
        cd.prev();
        cd.stop();



//
            mp3.play();
          mp3.next();
//        mp3.next();
//        mp3.next();
//        mp3.play();
            mp3.pause();







    }



}
