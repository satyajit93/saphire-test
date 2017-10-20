package com.saphire.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreData {
	public static void toWorkbook(String fileName,String sheet,int r,int c,String data){
				try{
					File f=new File("./test-data/"+fileName+".xlsx");
					FileInputStream fis=new FileInputStream(f);
					Workbook wb=WorkbookFactory.create(fis);
					wb.getSheet(sheet).getRow(r).getCell(c).setCellValue(data);
					FileOutputStream fos=new FileOutputStream(f);
					wb.write(fos);
					wb.close();
				}catch(Exception e){
					e.printStackTrace();
				}
	}
	public static void toProperties(String fileName,String key,String value,String msg){
				try{
					File f=new File("./test-config-data/"+fileName+".properties");
					FileInputStream fis=new FileInputStream(f);
					Properties prop=new Properties();
					prop.load(fis);
					prop.setProperty(key,value);
					FileOutputStream fos=new FileOutputStream(f);
					prop.store(fos, msg);
					}catch(Exception e){
					e.printStackTrace();
				}
	}
}
