import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TraverseFolder traverseFolder =TraverseFolder.getTraverseFolder();
        traverseFolder.traverseFolder("/Users/admin/Documents", "/Users/admin/Public/test.txt");
    }
}
