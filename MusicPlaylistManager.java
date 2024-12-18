
package musicplaylistmanager;
//điều khiển toàn bộ chương trình, cho phép người dùng tương tác với playlist.
import java.util.Scanner;  // Để sử dụng Scanner cho việc nhập liệu từ người dùng

public class MusicPlaylistManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Đối tượng scanner để nhận dữ liệu từ người dùng
        Playlist playlist = new Playlist();  // Tạo playlist mới
        boolean running = true;  // Biến điều khiển vòng lặp chính

        System.out.println("Welcome to the Music Playlist Manager!");  // Thông báo chào mừng

        // Vòng lặp để người dùng chọn các thao tác
        while (running) {
            // Hiển thị menu lựa chọn
            System.out.println("\nOptions:");
            System.out.println("1. Add a song");
            System.out.println("2. Remove a song");
            System.out.println("3. View playlist");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();  // Nhận lựa chọn từ người dùng
            scanner.nextLine(); // Đọc ký tự '\n' còn lại sau khi nhận số

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();  // Nhập tiêu đề bài hát
                    System.out.print("Enter artist name: ");
                    String artist = scanner.nextLine();  // Nhập tên nghệ sĩ
                    playlist.addSong(new Song(title, artist));  // Thêm bài hát vào playlist
                    break;
                case 2:
                    System.out.print("Enter the title of the song to remove: ");
                    String removeTitle = scanner.nextLine();  // Nhập tiêu đề bài hát cần xoá
                    playlist.removeSong(removeTitle);  // Xoá bài hát
                    break;
                case 3:
                    playlist.displaySongs();  // Hiển thị playlist
                    break;
                case 4:
                    running = false;  // Dừng vòng lặp và thoát
                    System.out.println("Exiting the Music Playlist Manager. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");  // Thông báo nếu lựa chọn không hợp lệ
            }
        }

        scanner.close();  // Đóng đối tượng scanner khi không còn sử dụng
    }
}

