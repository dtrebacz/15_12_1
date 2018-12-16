package pl.Lab_4_3;

public class MP3_Player extends MusicPlayer {

Song[] playlist =new Song[5];


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
    void setSongNr(int sn) {

       SongNr = sn;

        if (getSongNr() > playlist.length) {
            setSongNr(0);
        } ;
        if (getSongNr() < 0) {
            setSongNr(playlist.length-1);
        } ;
    }
//-------------------------
@Override
public void play() {

    setStatus("Playing");
    show();
    System.out.println(playlist[getSongNr()]);

}

    @Override
    public void pause() {

        setStatus("Paused");
        show();
        System.out.println(playlist[getSongNr()]);
    }

    @Override
    public void stop() {

        setStatus("Stoped");
        show();
        System.out.println(playlist[getSongNr()]);

    }

    @Override
    public void next() {

        setSongNr(getSongNr() + 1);
        show();
        System.out.println(playlist[getSongNr()]);
    }

    @Override
    public void prev() {
        setSongNr(getSongNr()-1);


        show();
        System.out.println(playlist[getSongNr()]);
    }

    @Override
    public void loadPlaylist() {

        playlist[0] = new Song("Sabrina","Boys","Sabrina");
        playlist[1] = new Song("Artist1","Title1","MP3Album1");
        playlist[2] = new Song("Artist2","Title2","MP3Album2");
        playlist[3] = new Song("Artist3","Title3","MP3Album3");
        playlist[4] = new Song("Artist4","Title4","MP3Album4");


        for (int i = 0; i < playlist.length; i++) {
            System.out.println(playlist[i].getArtist());

        }
}
}
