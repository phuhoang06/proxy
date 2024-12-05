import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // URL của file cần tải
        Scanner sc = new Scanner(System.in);
        System.out.print("url :");
        String url = sc.nextLine();
        System.out.println();
        System.out.print("description :");
        String destination = sc.nextLine();

        // Sử dụng FileDownloaderProxy
        Downloader downloader = new FileDownloaderProxy();
        downloader.download(url, destination);
    }
}