package txtintotxt2;

import java.io.*;

/**
 * Created by admin on 16/2/4.
 */
public class ScanningFilePath implements ScanningMachine {


    private String filePath;

    private String fileName;

    public ScanningFilePath(String filePath, String fileName) {
        this.fileName = fileName;
        this.filePath = filePath;
    }

    @Override
    public void scanning() {
        File file = new File(filePath);
        if (file.exists()&&!fileName.equals("")) {
            File[] filelist = file.listFiles();
            for (File file2 : filelist){

                if(this.isTxt(file2.getName())&&!file2.getAbsolutePath().equals(fileName)){
                    readAndWrite(file2.getAbsolutePath(),fileName);
                }
            }

        } else {
            System.out.printf("error!");
        }
    }

    private boolean isTxt(String fileName){
        int length = fileName.length();
        String txt = ".txt";
        if(fileName.substring(length-4,length).equals(txt))
            return true;
        return false;
    }
    public void readAndWrite(String readfilename,String writefilename) {
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
}
