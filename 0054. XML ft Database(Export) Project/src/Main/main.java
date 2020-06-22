package Main;

import Model.Entity.Person;
import Model.Repository.PersonDA;
import Model.Service.PersonService;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.Format;
import org.jdom.output.XMLOutputter;

import java.io.File;
import java.io.FileWriter;
import java.util.List;

public class main {
    public static void main(String[] args) throws Exception {
        /*
        // part 1: database -> xml file & delete data of table
        Element aut = new Element("Aut");

        List<Person> personList = PersonService.getInstance().findAll();

        for (Person person : personList) {
            Element student = new Element("student");
            student.setAttribute("id", String.valueOf(person.getId()));
            student.addContent(new Element("name").setText(person.getName()));
            student.addContent(new Element("family").setText(person.getFamily()));
            aut.addContent(student);
            PersonService.getInstance().remove(person.getId());
        }

        Document document1 = new Document(aut);
        XMLOutputter xmlOutputter = new XMLOutputter();
        xmlOutputter.setFormat(Format.getPrettyFormat());
        xmlOutputter.output(document1, new FileWriter("file.xml"));
        */


        // part 2: xml file -> database
        SAXBuilder saxBuilder = new SAXBuilder();
        File file = new File("file.xml");

        Document document2 = saxBuilder.build(file);
        Element element = document2.getRootElement();
        List<Element> elementList = element.getChildren();
        for (Element element1 : elementList) {
            Person person = new Person();
            person.setId(Long.parseLong(element1.getAttribute("id").getValue()));
            person.setName(element1.getChild("name").getText());
            person.setFamily(element1.getChild("family").getText());
            PersonService.getInstance().register(person);
        }

    }
}
