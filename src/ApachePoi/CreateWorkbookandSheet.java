package ApachePoi;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateWorkbookandSheet {

    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("Test");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Names");
        sheet.getRow(0).createCell(1).setCellValue("Hello");
        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("sdasd");
        sheet.getRow(1).createCell(1).setCellValue("kkkk");

        File file =new File("D:\\ApachePoi_Xcel Project\\test.xlsx");
        FileOutputStream fileOutputStream=new FileOutputStream(file);
        workbook.write(fileOutputStream);
        workbook.close();


    }


}
