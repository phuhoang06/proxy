public class FileDownloaderProxy implements Downloader {
    private FileDownloader fileDownloader;

    @Override
    public void download(String url, String destination) {
        if (fileDownloader == null) {
            // Tạo đối tượng FileDownloader với User-Agent của Firefox
            fileDownloader = new FileDownloader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36");
        }
        // Chuyển lời gọi đến phương thức download() của FileDownloader
        fileDownloader.download(url, destination);
    }
}
