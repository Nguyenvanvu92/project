
package musicplaylistmanager;
//quản lý danh sách bài hát với các chức năng thêm, xoá, và hiển thị
import java.util.ArrayList;  // Cần sử dụng ArrayList để quản lý danh sách bài hát

class Playlist {
    private ArrayList<Song> songs;  // Danh sách các bài hát trong playlist

    // Constructor khởi tạo danh sách bài hát rỗng
    public Playlist() {
        this.songs = new ArrayList<>();
    }

    // Phương thức để thêm một bài hát vào playlist
    public void addSong(Song song) {
        songs.add(song);
        System.out.println("Song added: " + song.getTitle());
    }

    // Phương thức để xoá một bài hát dựa trên tiêu đề
    public void removeSong(String title) {
        boolean found = false;
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                songs.remove(song);
                System.out.println("Song removed: " + title);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Song not found: " + title);
        }
    }

    // Phương thức hiển thị tất cả bài hát trong playlist
    public void displaySongs() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
        } else {
            System.out.println("Your Playlist:");
            for (Song song : songs) {
                System.out.println(song);
            }
        }
    }
}
