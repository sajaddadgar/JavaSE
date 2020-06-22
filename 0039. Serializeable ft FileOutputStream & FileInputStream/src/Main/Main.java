package Main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) throws Exception {

        Human sajad = new Human();
        Human mohammad = new Human();
        sajad.setAge(20);
        sajad.setHaircolor("black");
        mohammad.setAge(21);
        mohammad.setHaircolor("brown");
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0039. Serializeable ft FileOutputStream & FileInputStream\\newFile.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(sajad);
        objectOutputStream.writeObject(mohammad);
        objectOutputStream.close();
        fileOutputStream.close();


    }
}
