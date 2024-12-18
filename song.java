
package musicplaylistmanager;
// Lớp Song đại diện cho một bài hát với các thuộc tính tiêu đề và nghệ sĩ.
class Song {
    private String title;  // Tiêu đề bài hát
    private String artist; // Nghệ sĩ của bài hát

    // Constructor khởi tạo với tiêu đề và nghệ sĩ
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    // Getter để lấy tiêu đề bài hát
    public String getTitle() {
        return title;
    }

    // Getter để lấy tên nghệ sĩ
    public String getArtist() {
        return artist;
    }

    // Phương thức toString để trả về thông tin bài hát
    @Override
    public String toString() {
        return "Song: " + title + " | Artist: " + artist;
    }
}
