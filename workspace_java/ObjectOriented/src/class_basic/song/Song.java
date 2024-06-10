package class_basic.song;

public class Song {
    String title;
    String artist;
    String album;
    int year;
    String[] composer;

    public void setAll(String title1, String artist2, String album3, int year4, String[] composer5) {
        /*title = "";
        artist = "";
        album = "";
        year = 0;
        composer = "";*/
        title = title1;
        artist = artist2;
        album = album3;
        year = year4;
        composer = composer5;
    }

    public void printSongInfo() {
        System.out.println("노래 제목 : " + title);
        System.out.println("가수 : " + artist);
        System.out.println("앨범 제목 : " + album);
        System.out.println("발표 연도 : " + year);
        System.out.print("작곡가  : ");
        for (int i = 0; i < composer.length; i++) {
            System.out.print(composer[i] + " ");
        }
    }
}
