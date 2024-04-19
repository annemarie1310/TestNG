package ApachePoi;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadSheet {
    public static void main(String[] args) throws Exception {

        File file =new File("D:\\ApachePoi_Xcel Project\\test.xlsx");
        FileInputStream fis =new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheetAt(0);
        String Cellvalue= sheet.getRow(0).getCell(0).getStringCellValue();
        System.out.println(Cellvalue);

        workbook.close();
        fis.close();


    }
}
