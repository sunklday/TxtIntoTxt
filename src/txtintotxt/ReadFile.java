package txtintotxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by admin on 2016/2/2.
 */
public class ReadFile {


    public static void readfile(String fileName,String writefileName) throws IOException {
        String line = fileName;
        BufferedReader in = new BufferedReader(new FileReader(fileName));
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
