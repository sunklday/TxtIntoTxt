package txtintotxt2;

import java.io.*;

/**
 * Created by admin on 16/2/4.
 */
public class WriterTextFile implements WriteMachine,ReadMachine {

    private final String readfilename;
    private final String writefilename;

    public WriterTextFile(String readfile,String writefile){
        this.readfilename =readfile;
        this.writefilename = writefile;
    }

    public void readAndWrite() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(readfilename));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(writefilename,true));
            String line = readfilename;
            while(line!=null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            }
            bufferedWriter.close();
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void read(String filename) {

    }

    @Override
    public void write(String filename) {

    }
}
