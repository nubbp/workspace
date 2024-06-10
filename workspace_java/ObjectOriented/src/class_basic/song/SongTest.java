package class_basic.song;

public class SongTest {
    public static void main(String[] args) {
        Song song1 = new Song();

        String[] a = {"작곡가1", "작곡가2", "작곡가3"};
        song1.setAll("노래제목임", "가수이름임", "앨범제목임", 1999, a);
        song1.printSongInfo();
    }
}
