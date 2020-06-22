package Main;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) throws Exception{


        // file.mkdir: ye file ya diractory dorost mikone. (bayad daroon file faghat name diractory voroodi bashe)
        // file.delete: file ya diractory delete mikone.
        // file.deleteOnExit: vaghti barname tamoom shod delete mikone.

        /*
        File file = new File("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0034. File\\file01.txt");
        file.mkdir();
        file.delete();
        file.deleteOnExit();
        System.out.println(file.exists());
        System.out.println(file.getFreeSpace()/1024/1024 + " mb");
        System.out.println(file.getTotalSpace()/1024/1024 + " mb");
        System.out.println(file.getParent());

        String[] dir = file.list();
        for (String s : dir) {
            System.out.println(s);
        }
        */

        // make new file
        /*
        File file = new File("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0034. File\\file01.txt");
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("AUT \r\n Amirkabir university Tehran.");
        fileWriter.close();
        */

        // read from file
        /*
        File file = new File("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0034. File\\file01.txt");
        FileReader fileReader = new FileReader(file);
        int ascii = fileReader.read();
        String s = " ";
        while (ascii != -1){

            s += (char) ascii;
            ascii = fileReader.read();
        }
        fileReader.close();
        System.out.println(s);
        */

    }
}
