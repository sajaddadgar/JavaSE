package view;

import Model.Entity.Person;
import Model.Service.PersonService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.List;

public class main {

    private static final String file = "G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0057. Write database in excel\\data.xlsx";

    public static void main(String[] args) {

        try {


            List<Person> personList = PersonService.getInstance().findAll();
            XSSFWorkbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data of Database");
            String[][] data = new String[PersonService.getInstance().PersonNumber()+1][4];

            data[0][0] = "id";
            data[0][1] = "name";
            data[0][2] = "family";
            data[0][3] = "salary";


            for (int i = 1; i < PersonService.getInstance().PersonNumber()+1; i++){
                Person person = personList.get(i-1);
                data[i][0] = String.valueOf(person.getId());
                data[i][1] = person.getName();
                data[i][2] = person.getFamily();
                data[i][3] = String.valueOf(person.getSalary());
            }

            int rowNum = 0;
            System.out.println("creating excell file");
            for (String[] datum : data) {
                Row row = sheet.createRow(rowNum++);
                int colNum = 0;
                for (String field : datum) {
                    Cell cell = row.createCell(colNum++);

                    if (field instanceof String){
                        cell.setCellValue((String) field);
                    }
                }


            }

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
            workbook.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("done");
    }
}
