package txtintotxt2;

/**
 * Created by admin on 16/2/4.
 */
public class main {
    public static void main(String[] args) {
        ScanningFilePath scanningFilePath = new ScanningFilePath("/Users/admin/Documents", "/Users/admin/Documents/test.txt");
        scanningFilePath.scanning();
    }
}
