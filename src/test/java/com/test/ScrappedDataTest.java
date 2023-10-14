package com.test;

import org.testng.annotations.Test;

import com.page.NcesSearch;
import com.utilis.CsvReadWrite;
import com.utilis.Utility;

public class ScrappedDataTest extends Utility {

	@Test
	public void writeCSVScrappedData() throws Throwable {
		openApplication();
		NcesSearch nces = new NcesSearch(driver);	
		nces.enterData();
		nces.search();
		nces.extractData();
		CsvReadWrite write = new CsvReadWrite();
		write.writeData(nces.length());
	}
}
