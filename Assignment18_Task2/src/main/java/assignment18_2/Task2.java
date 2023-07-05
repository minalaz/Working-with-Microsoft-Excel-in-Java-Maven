package assignment18_2;

import com.github.javafaker.Faker;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) throws IOException {

            FileInputStream inputStream = new FileInputStream("TestZadatak2.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("List1");
            XSSFRow row = sheet.getRow(0);

            ArrayList<String> listOfNames = new ArrayList<>();

            for (int i = 0; i < 5; i++) {
                listOfNames.add(String.valueOf(row.getCell(i)));
            }
            System.out.println(listOfNames);
            Faker faker = new Faker();
            for (int i = 0; i < 5; i++) {
                listOfNames.add(String.valueOf(faker.name().firstName()));
            }
            System.out.println(listOfNames);
//

            XSSFSheet sheet2 = workbook.createSheet("List2");
            XSSFRow row2 = sheet2.createRow(0);

            for (int i = 0; i < listOfNames.size(); i++) {
                XSSFCell cell = row2.createCell(i);
                cell.setCellValue(listOfNames.get(i));
            }

            FileOutputStream outputStream = new FileOutputStream("TestZadatak2.xlsx");
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();



    }



    }

