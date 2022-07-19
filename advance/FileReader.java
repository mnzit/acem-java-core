import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FileReader implements Reader {
    private String path;

    public FileReader(String path) {
        this.path = path;
    }

    @Override
    public String read() throws Exception{
        BufferedReader br = new BufferedReader(new java.io.FileReader(path));
        StringBuffer result = new StringBuffer();

        String line;
        while((line = br.readLine()) != null){
            result.append(line);
            result.append("\n");
        }
        return result.toString();
    }
}
