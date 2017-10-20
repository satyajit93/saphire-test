package com.saphire.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {
	public static String fromWorkbook(String fileName,String sheet,int r,int c){
		String data=null;
				try{
					File f=new File("./test-data/"+fileName+".xlsx");
					FileInputStream fis=new FileInputStream(f);
					Workbook wb=WorkbookFactory.create(fis);
					data=wb.getSheet(sheet).getRow(r).getCell(c).getStringCellValue();
				}catch(Exception e){
					e.printStackTrace();
				}
		return data;
	}
	public static String fromProperties(String fileName,String key){
		String value=null;
				try{
					File f=new File("./test-config-data/"+fileName+".properties");
					FileInputStream fis=new FileInputStream(f);
					Properties prop=new Properties();
					prop.load(fis);
					value=(String)prop.get(key);
				}catch(Exception e){
					e.printStackTrace();
				}
		return value;
	}
}
