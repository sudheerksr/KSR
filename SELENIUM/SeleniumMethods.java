package com.seleniumnethods;

import java.util.Arrays;
import java.util.List;

public class SeleniumMethods {

	public static void main(String[] args) {
		
		//verify list of items in select box
		verifySelectedItemsInList();
		//Retrieves the first matching value in table
		findFirstItem();
		//verify Table Headers
		verifyHeaders("abc","def","hyd");
		//CloseAll browsers
		closeAllBrowsers();
		//sortBy //true==ascending flase descending
		sortBy(true,"columnName");
		
		
	}

	private static void sortBy(boolean b, String columnName) {
		Information inf=new Information();
		inf.doubleClick(columnName);
		if(b) {
			inf.doubleClick(columnName);
		}
		
	}

	private static void closeAllBrowsers() {		
		Information inf=new Information();
		for (Browser b : ((List<String>) Browser.getAllbrowsers).get(0)) {
			if (b.getTitle.equals("Title")) {
				b.close();
			}
		}
	}

	private static void verifyHeaders(String... filters) {
		
		Information inf=new Information();
		String headers[]=inf.table_getRow(0);
		if (headers.length==filters.length){
			for (int i = 0; i < filters.length; i++) {
				if (headers[i].contains(filters[i])) {
					boolean result=true;
				}else {
					boolean result=false;
				}
			}
			
		}
		
		
	}

	private static   void verifySelectedItemsInList() {
		Information inf=new Information();		
		String items[]=inf.getItemsInList();
		List<String> item=Arrays.asList(items);		
		System.out.println("Slected Item in list is.."+item.contains(""));
	}
	private static int  findFirstItem() {
		Information inf=new Information();		
		Integer[] value=inf.Table_contains(true,"Value of string to verify");
		if(value.length>0) {
			return value[0];
		}
		return (Integer) null;
	}
	

}
