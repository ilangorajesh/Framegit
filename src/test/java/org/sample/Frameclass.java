package org.sample;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Frameclass {
public static void main(String[] args) throws InvalidFormatException, IOException {
	File file= new File("C:\\Users\\HP PC\\eclipse-workspace\\FrameWork\\driver\\Sheet1`.xlsx");
	Workbook workbook= new XSSFWorkbook(file);
	Sheet sheet = workbook.getSheet("Sheet1");
for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
	Row row = sheet.getRow(i);
}
}
}
