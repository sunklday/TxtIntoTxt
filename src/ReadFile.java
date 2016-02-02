import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by admin on 2016/2/2.
 */
public class ReadFile {
    private String fileName;
    private String writefileName;
    public ReadFile(String fileName,String writefileName) {
        this.fileName = fileName;
        this.writefileName=writefileName;
    }

    public void readfile() throws IOException {
        String line = "";
        BufferedReader in = new BufferedReader(new FileReader(fileName));
        line = in.readLine();
        while (line != null) {
            /**
             *写入文件
             */
            WriteFile writeFile=new WriteFile(writefileName);
            writeFile.writeFile(line);
            line=in.readLine();
        }
        in.close();
    }
}
