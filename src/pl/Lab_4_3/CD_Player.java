package pl.Lab_4_3;

public class CD_Player extends MusicPlayer {

    Song[] playlist =new Song[50];


    public CD_Player() {
        setStatus("CD initialized and stopped");
    }

    public CD_Player(String n) {
        setStatus("CD initialized and stopped");
        setName("CD Player -" +n);
    }

//------------------------------------------------------------------------



    @Override
    void show() {
        System.out.println("MP3 Music player ");
        System.out.println("---------------------------------------");
        System.out.println(this);

    }

    @Override
    void setSongNr(int songNr) {

    }

    @Override
    public void next() {
        show();
    }

    @Override
    public void prev() {
        show();
    }

    @Override
    public void loadPlaylist() {

    }
}
