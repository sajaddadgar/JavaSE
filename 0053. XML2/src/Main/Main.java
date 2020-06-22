package Main;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception{
        /*
        Element aut = new Element("AUT");

        Element student1 = new Element("Student");
        student1.addContent(new Element("name").setText("Sajad"));
        student1.addContent(new Element("family").setText("Dadgar"));
        student1.setAttribute("id", "1");

        Element student2 = new Element("Student");
        student2.addContent(new Element("name").setText("Mohamad"));
        student2.addContent(new Element("family").setText("Shirzadi"));
        student2.setAttribute("id", "2");

        Element student3 = new Element("Student");
        student3.addContent(new Element("name").setText("Saeid"));
        student3.addContent(new Element("family").setText("Ghiasi"));
        student3.setAttribute("id", "3");

        Element student4 = new Element("Student");
        student4.addContent(new Element("name").setText("Hossein"));
        student4.addContent(new Element("family").setText("Roodbarani"));
        student4.setAttribute("id", "4");

        aut.addContent(student1);
        aut.addContent(student2);
        aut.addContent(student3);
        aut.addContent(student4);

        Document document = new Document(aut);

        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(document, new FileWriter("file.xml"));
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
