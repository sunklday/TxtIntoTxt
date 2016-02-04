package txtintotxt;

import java.io.*;

/**
 * Created by admin on 2016/2/2.
 */
public class WriteFile {

    public static void writeFile(String line,String fileName) throws IOException {

        BufferedWriter out= new BufferedWriter(new FileWriter(fileName,true));
        out.write(line);
        out.newLine();
        out.flush();
        out.close();
    }
}
