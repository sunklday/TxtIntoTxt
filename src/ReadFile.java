import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by admin on 2016/2/2.
 */
public class ReadFile {


    public static void readfile(String fileName,String writefileName) throws IOException {
        WriteFile.writeFile(fileName,writefileName);
        String line = "";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        line = in.readLine();
        while (line != null) {
            /**
             *写入文件
             */
            WriteFile.writeFile(line,writefileName);
            line=in.readLine();
        }

        in.close();
    }
}
