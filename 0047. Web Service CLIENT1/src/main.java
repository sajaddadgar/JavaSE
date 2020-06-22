import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class main {
    public static void main(String[] args) throws Exception{

        URL url = new URL("http://localhost:8081/rest/calcService/sum?x=85&y=9");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        String content = "";
        int ascii = inputStream.read();
        while (ascii != -1){
            content += (char) ascii;
            ascii = inputStream.read();
        }
        inputStream.close();
        System.out.println(content);


    }
}
