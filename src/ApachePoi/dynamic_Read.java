package ApachePoi;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class dynamic_Read {
    public static void main(String[] args) throws Exception {


        File file =new File("D:\\ApachePoi_Xcel Project\\test.xlsx");
        FileInputStream fis =new FileInputStream(file);
        XSSFWorkbook workbook=new XSSFWorkbook(fis);
        XSSFSheet sheet =workbook.getSheetAt(0);

        int rowCount =sheet.getPhysicalNumberOfRows();

        for (int i=0;i<rowCount;i++){
            XSSFRow row =sheet.getRow(i);

            int cellCount =row.getPhysicalNumberOfCells();

            for (int j=0;j<cellCount;j++){
                XSSFCell cell= row.getCell(j);
                String cellValue =getCellvalue(cell);
                System.out.print("||"+cellValue);
            }
            System.out.println();
        }
        workbook.close();
        fis.close();
    }

    public static String getCellvalue (XSSFCell cell)
    {
        switch (cell.getCellType())
        {

            case NUMERIC :
                return String.valueOf(cell.getNumericCellValue());
            case BOOLEAN :
                return String.valueOf(cell.getBooleanCellValue());
            case STRING:
                return cell.getStringCellValue();

            default:
                return cell.getStringCellValue();
        }
    }


}
