package pl.Lab_4_3;

abstract class MusicPlayer implements Player{
    private String name = new String();
    private String song = new String();
    private String status = new String();
    public int SongNr;

    public int getSongNr() {
        return SongNr;
    }

    abstract void setSongNr(int songNr);

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getSong() {
        return song;
    }

    public final void setSong(String song) {
        this.song = song;
    }

    public final String getStatus() {
        return status;
    }

    public final void setStatus(String status) {
        this.status = status;
    }



  abstract void show();





    @Override
    public String toString() {
        return "MusicPlayer{" +
                "name='" + name + '\'' +
                ", song='" + song + '\'' +
                ", status='" + status + '\'' +
                ", Song nr='" + getSongNr() + '\'' +
                '}';
    }
}
