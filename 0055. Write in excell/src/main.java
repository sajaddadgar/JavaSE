import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;

public class main {

    private static final String file = "G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0055. Write in excell\\file.xlsx";

    public static void main(String[] args) {

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("DataTypes in java");
        Object[][] dataTypes = {

                {"DataType", "Type", "Size(in bytes)"},
                {"int", "primitive", 2},
                {"float", "primitive", 4},
                {"double", "primitive", 8},
                {"char", "primitive", 1},
                {"String", "non-primitive", "no fixed size"}
        };

        int rowNum = 0;
        System.out.println("creating excel");


        for (Object[] dataType : dataTypes) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : dataType) {
                Cell cell = row.createCell(colNum++);

                if (field instanceof String){
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer){
                    cell.setCellValue((Integer) field);
                }

            }
        }


        try {

            FileOutputStream fileOutputStream = new FileOutputStream(file);
            workbook.write(fileOutputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("done");


    }
}
