package pl.Lab_4_3;

public class Song {
    private String artist = new String();
    private String title = new String();
    private String album = new String();

    public Song(String artist, String title, String album) {
        this.artist = artist;
        this.title = title;
        this.album = album;
    }


    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "artist='" + artist + '\'' +
                ", title='" + title + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
