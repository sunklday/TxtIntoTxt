import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");
        TraverseFolder traverseFolder =new TraverseFolder();
        System.out.println(TraverseFolder.subtxtstring("C:\\Users\\Sun\\Documents\\study\\test.txt"));
        traverseFolder.traverseFolder("C:\\Users\\Sun\\Documents\\study", "C:\\Users\\Sun\\Documents\\test.txt");
    }
}
