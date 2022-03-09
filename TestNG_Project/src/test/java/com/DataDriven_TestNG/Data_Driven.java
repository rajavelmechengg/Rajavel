package com.DataDriven_TestNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	public static void main(String[] args) throws IOException {
		
		 File file = new File("C:\\Users\\Raja\\eclipse-workspace\\MavenProject\\DataDrivenRaja.xlsx");
		 FileInputStream f = new FileInputStream(file);
		 Workbook data = new XSSFWorkbook(f);
		 Sheet sheetAt = data.getSheetAt(0);
		 int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		 for (int i = 0; i < numberOfRows; i++) {
			Row row = sheetAt.getRow(i);
			int numberOfCells = row.getPhysicalNumberOfCells();
			for (int j = 0; j < numberOfCells; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					int passwd = (int) numericCellValue;
					String valueOf = String.valueOf(passwd);
					System.out.println(valueOf);
				}
				
			}
		}
		
	}

}
