package com.saphire.generic.handlers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandlers {
	public static void selectByIndex(WebElement wb,int index){
		Select sel=new Select(wb);
		sel.selectByIndex(index);
	}
	public static void selectByValue(WebElement wb,String value){
		Select sel=new Select(wb);
		sel.selectByValue(value);
	}
	public static void selectByText(WebElement wb,String text){
		Select sel=new Select(wb);
		sel.selectByVisibleText(text);
	}
}
