import java.io.*;

/**
 * Created by admin on 2016/2/2.
 */
public class WriteFile {
    private String fileName;
    public WriteFile(String fileName){
        this.fileName=fileName;
    }
    public void writeFile(String line) throws IOException {
        BufferedWriter out= new BufferedWriter(new FileWriter(fileName));
        out.write(line);
        out.close();
    }
}
