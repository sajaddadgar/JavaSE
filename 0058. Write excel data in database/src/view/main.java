package view;

import Model.Entity.Person;
import Model.Service.PersonService;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws Exception {

        int[] a = new int[100];

        File file = new File("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0058. Write excel data in database\\data.xlsx");
        Workbook workbook = WorkbookFactory.create(file);
        System.out.println("excel data...");
        System.out.println("-------------------------------------");

        Sheet sheet = workbook.getSheetAt(0);

        for (int i = 1; i < sheet.getLastRowNum(); i++){

            Row row = sheet.getRow(i);
            Person person = new Person();

            person.setId(Long.parseLong(row.getCell(0).getStringCellValue()));
            person.setName(row.getCell(1).getStringCellValue());
            person.setFamily(row.getCell(2).getStringCellValue());
            person.setSalary(Long.parseLong(row.getCell(3).getStringCellValue()));

            PersonService.getInstance().registerPerson(person);

        }

    }
}
