package assignment18_1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {

            FileInputStream inputStream = new FileInputStream("TestDomaci1.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheetAt(0);
            XSSFSheet sheet2 = workbook.createSheet();


            for (int i = 0; i < 3; i++) {
                XSSFRow row = sheet.getRow(i);
                double sum = 0;
                double rowAvg = 0;
                for (int j = 0; j < 5; j++) {
                    XSSFCell cell = row.getCell(j);
                    sum = sum + row.getCell(j).getNumericCellValue();

                }

                rowAvg = sum / 5;
                sheet2.createRow(i).createCell(0).setCellValue(rowAvg);

            }
            FileOutputStream outputStream = new FileOutputStream("TestDomaci1.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
            System.out.println();
        }
        }
