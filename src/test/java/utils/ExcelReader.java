package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
    static Base base= new Base();
	static FileInputStream file;
	static Properties props;
	static XSSFWorkbook workbook;
	static XSSFSheet sheets;
	static XSSFCell column;
	static String value;
	static XSSFRow row;
    static String path=System.getProperty("user.dir")+"/config/config.properties";
    public static String getExcelPath() {
    	props= new Properties();
		try {
			file= new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			props.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return props.getProperty("excelPath");

    }
	public static String readExcel(String sheet, int rowId , int colId) 
	{
		String path=getExcelPath();
	
		
		try 
		{
			file= new FileInputStream(path);
			workbook= new XSSFWorkbook(file);
			sheets= workbook.getSheet(sheet);
			if (sheets == null) 
			{
	            return "Sheet not found";
	        }

			row= sheets.getRow(rowId);
	        if (row == null) 
	        {
	            return "Row not found";
	        }

	        column= row.getCell(colId);
	        if (column == null) 
	        {
	            return "Cell not found";
	        }
			
			value= column.getStringCellValue();
			
			
		}catch(IOException e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			if (workbook != null) {
                try {
					workbook.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("Error in closing workbook");
				}
            }
            if (file != null) {
                try {
					file.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.err.println("Error in closing file");
				}
            }
		}
		return value;

	}

}