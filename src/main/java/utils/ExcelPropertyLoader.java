package main.java.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.util.Dictionary;
import java.util.Hashtable;

public class ExcelPropertyLoader {
	private Dictionary<String, String> dic;
	
	public void LoadFile(String rutaArchivoExcel) {
		try {            
            FileInputStream inputStream = new FileInputStream(new File(rutaArchivoExcel));
            Workbook workbook = new XSSFWorkbook(inputStream);
            Sheet firstSheet = workbook.getSheetAt(0);
            Iterator iterator = firstSheet.iterator();
            
            
            dic = new Hashtable<String, String>();
            String key = "";
            String value = "";
            while (iterator.hasNext()) {
                Row nextRow = (Row) iterator.next();
                //Iterator cellIterator = nextRow.cellIterator();                
                key = nextRow.getCell(0).getStringCellValue();
                value = nextRow.getCell(1).getStringCellValue();
                dic.put(key, value);
            }            
        } catch (Exception e) {
            e.printStackTrace();
        }
	}
	
	public String getValue(String key) {
		return dic.get(key);
	}
}
