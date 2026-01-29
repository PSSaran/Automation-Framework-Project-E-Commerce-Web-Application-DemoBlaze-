package Exel;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_from_excel {
    public static void main(String[] args)   {
        String Location = "D:/IDLE/Practise/Selenium-maven/Exel_data/demoOne.xlsx";
        XSSFWorkbook Excel = null;
        try {
            Excel = new XSSFWorkbook(Location);
        }
        catch (Exception e) {
            System.out.println("ERRORRRR");
        }
        XSSFSheet Sheet = Excel.getSheetAt(0);
//        XSSFRow Row = Sheet.getRow(1);
//         XSSFCell cell = Row.getCell(0);
//         String Data = cell.getStringCellValue();
//        System.out.println("Data: " + Data);
      for(int i = 1 ; i<=3 ; i++)
      {
          XSSFRow Row = Sheet.getRow(i);
          for (int j = 0; j<=1 ; j++)
          {
              XSSFCell cell = Row.getCell(j);
              System.out.println(cell.getStringCellValue());
          }
      }


        System.out.println("hiiii");

    }
}
