package pl.Lab_4_3;

public class MP3_Player extends MusicPlayer {

Song[] playlist =new Song[50];


    public MP3_Player() {
        setStatus("Mp3 initialized and stopped");
    }

    public MP3_Player(String n) {
        setStatus("Mp3 initialized and stopped");
        setName("MP3 Player -" +n);
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
