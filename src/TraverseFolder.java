import java.io.File;
import java.io.IOException;

/**
 * Created by admin on 2016/2/2.
 */
public class TraverseFolder {
    public static String subtxtstring(String filename) {
        String txt = filename.substring(filename.length() - 4, filename.length());
        return txt;
    }

    public void traverseFolder(String path, String writeFileName) throws IOException {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        traverseFolder(file2.getAbsolutePath(), writeFileName);
                    } else {
                        System.out.println("文件" + file2.getAbsolutePath());
                        System.out.println(file2.getName());
                        if (subtxtstring(file2.getName()).equals(".txt")) {
                            String fileName = file2.getAbsolutePath();
                            ReadFile.readfile(fileName, writeFileName);
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
        }
    }
}
