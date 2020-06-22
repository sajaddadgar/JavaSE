package Main;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, JDOMException {
        /*

        Element sharif = new Element("sharif");

        Element student1 = new Element("student");
        student1.setAttribute("id", "1");
        student1.addContent(new Element("name").setText("ali"));
        student1.addContent(new Element("family").setText("ahmadi"));

        Element student2 = new Element("student");
        student2.setAttribute("id", "2");
        student2.addContent(new Element("name").setText("ali"));
        student2.addContent(new Element("family").setText("ahmadi"));

        sharif.addContent(student1);
        sharif.addContent(student2);

        Document document = new Document(sharif);
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(document, new FileWriter("file.xml"));

        encription
        aes
        rsa
        rsa -> man in the  middle
        */

        SAXBuilder saxBuilder = new SAXBuilder();
        File file = new File("file.xml");

        Document document = saxBuilder.build(file);
        Element element = document.getRootElement();
        List<Element> student = element.getChildren();
        for (Element element1 : student) {
            System.out.println(element1.getAttribute("id").getValue());
            System.out.println(element1.getChild("name").getText());
            System.out.println(element1.getChild("family").getText());
        }

    }
}
