import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class main {
    public static void main(String[] args) throws Exception{

        URL url = new URL("http://localhost:8081/rest/calcTimeService/sum?x=55&y=45");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        int ascii = inputStream.read();
        String content = "";
        while(ascii != -1){
            content += (char) ascii;
            ascii = inputStream.read();
        }
        inputStream.close();
        JSONObject jsonObject = (JSONObject) new JSONParser().parse(content);
        System.out.println(jsonObject.get("result"));
        System.out.println(jsonObject.get("responseTime"));
    }
}
