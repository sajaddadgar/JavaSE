package View;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception{


        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------");
        System.out.println("1. List of the persons");
        System.out.println("2. Register person");
        System.out.println("3. Change data of the person");
        System.out.println("4. Remove person");
        System.out.println("------------------------------------------");
        System.out.println("What can I do for you? ");
        int ans = Integer.parseInt(scanner.nextLine());

        switch (ans){

            case 1:
                URL url1 = new URL("http://localhost:8081/rest/personService/getAll");
                URLConnection urlConnection1 = url1.openConnection();
                InputStream inputStream1 = urlConnection1.getInputStream();
                String json1 = "";
                int ascii1 = inputStream1.read();
                while (ascii1 != -1){
                    json1 += (char) ascii1;
                    ascii1 = inputStream1.read();
                }
                inputStream1.close();

                JSONArray jsonArray = (JSONArray) new JSONParser().parse(json1);
                for (Object o : jsonArray) {
                    JSONObject jsonObject = (JSONObject) o;
                    System.out.println(jsonObject.get("name"));
                    System.out.println(jsonObject.get("family"));
                    System.out.println(jsonObject.get("nationalCode"));
                    System.out.println("------------------------------------------");
                }
                break;

            case 2:
                System.out.println("Enter Name-> ");
                String name2 = scanner.nextLine();
                System.out.println("Enter Family-> ");
                String family2 = scanner.nextLine();
                System.out.println("Enter National Code-> ");
                String nationalCode2 = scanner.nextLine();
                URL url2 = new URL("http://localhost:8081/rest/personService/registerPerson?name="+name2+"&family="+family2+"&nationalCode="+nationalCode2);
                URLConnection urlConnection2 = url2.openConnection();
                InputStream inputStream2 = urlConnection2.getInputStream();
                int ascii2 = inputStream2.read();
                String json2 = "";
                while (ascii2 != -1){
                    json2 += (char) ascii2;
                    ascii2 = inputStream2.read();
                }
                System.out.println("------------------------------------------");
                System.out.println(json2);

                break;

            case 3:
                System.out.println("Enter your ID-> ");
                long id3 = Long.parseLong(scanner.nextLine());
                System.out.println("Enter new Name-> ");
                String name3 = scanner.nextLine();
                System.out.println("Enter new Family-> ");
                String family3 = scanner.nextLine();
                URL url3 = new URL("http://localhost:8081/rest/personService/changePerson?id="+id3+"&name="+name3+"&family="+family3);
                URLConnection urlConnection3 = url3.openConnection();
                InputStream inputStream3 = urlConnection3.getInputStream();
                int ascii3 = inputStream3.read();
                String json3 = "";
                while (ascii3 != -1){
                    json3 += (char) ascii3;
                    ascii3 = inputStream3.read();
                }
                System.out.println("------------------------------------------");
                System.out.println(json3);
                break;

            case 4:
                System.out.println("Enter your ID-> ");
                long id4 = Long.parseLong(scanner.nextLine());
                URL url4 = new URL("http://localhost:8081/rest/personService/removePerson?id="+id4);
                URLConnection urlConnection4 = url4.openConnection();
                InputStream inputStream4 = urlConnection4.getInputStream();
                int ascii4 = inputStream4.read();
                String json4 = "";
                while (ascii4 != -1){
                    json4 += (char) ascii4;
                    ascii4 = inputStream4.read();
                }
                System.out.println("------------------------------------------");
                System.out.println(json4);
        }

    }
}
