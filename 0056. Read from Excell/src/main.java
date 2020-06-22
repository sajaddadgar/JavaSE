import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

public class main {


    public static void main(String[] args) throws IOException, InvalidFormatException {


        File file = new File("G:\\New folder\\Pogramming\\Java\\code\\ROOT\\0055. Write in excell\\file.xlsx");

        Workbook workbook = WorkbookFactory.create(file);

        // part 1
        System.out.println("Number of sheets -> " + workbook.getNumberOfSheets());


        // part 2
        System.out.print("Name of sheet -> ");
        for (Sheet sheet : workbook) {
            System.out.println(sheet.getSheetName());
        }


        //part 3
        DataFormatter dataFormatter = new DataFormatter();
        Sheet sheet = workbook.getSheetAt(0);
        System.out.println("excell data-> ");
        for (Row row : sheet) {
            for (Cell cell : row) {
                String cellValue = dataFormatter.formatCellValue(cell);
                System.out.print(cellValue + "\t");
            }
            System.out.println();
        }

    }
}
