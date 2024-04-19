package ExcelWrite_withDataProvider;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class excel_write {

    String fpath="D:\\ApachePoi_Xcel Project\\OrangeHrmLogin.xlsx";
    File file;
    FileOutputStream fos;
    XSSFWorkbook wb;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;
    int Index=0;

    @BeforeTest
    public void beforeTest() throws FileNotFoundException {

        file =new File(fpath);
        fos=new FileOutputStream(file);
        wb=new XSSFWorkbook();
        sheet=wb.createSheet("Login Data");

        row=sheet.createRow(0);
        cell=row.createCell(0);
        cell.setCellValue("Username");

        cell=row.createCell(1);
        cell.setCellValue("Password");

        cell=row.createCell(2);
        cell.setCellValue("Result");

    }


    @Test(dataProvider = "OHRMLginData" )
    public void write(String username , String password){

    row=sheet.createRow(Index);
    cell=row.createCell(0);
    cell.setCellValue(username);

        cell=row.createCell(1);
        cell.setCellValue(password);

        cell=row.createCell(2);
        cell.setCellValue("Not Performed");

        Index++;
    }



    @DataProvider
    public Object[][] OHRMLginData(){
        return new Object[][]{
                new Object[]{"Admin","admin123"},   //Valid
                new Object[]{"AAAdmin","fdsf"},      //invalid
                new Object[]{"Admnin","00admin12"},      //invalid
        };
    }


    @AfterTest
    public void afterTest() throws IOException {

    wb.write(fos);
    wb.close();
    fos.close();


    }

}
