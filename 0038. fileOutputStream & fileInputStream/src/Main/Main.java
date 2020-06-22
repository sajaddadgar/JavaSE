package Main;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        String str1 = "sajad";
        String str2 = "dadgar";
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0038. fileOutputStream & fileInputStream\\newFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(str1);
        objectOutputStream.writeObject(str2);
        objectOutputStream.close();
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0038. fileOutputStream & fileInputStream\\newFile.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        String str3 = (String) objectInputStream.readObject();
        String  str4 = (String) objectInputStream.readObject();
        System.out.println(str3);
        System.out.println(str4);

    }
}
