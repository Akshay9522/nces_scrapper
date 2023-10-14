package com.utilis;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class CsvReadWrite {

	Utility utl = new Utility();
	String schoolName;
	String adress;
	String phoneNumber;
	String country;
	String student;
	String grade;


	public  void writeData(int i)
	{
	
		File file = new File(System.getProperty("user.dir")+"//school_data.csv");
		try {
			FileWriter output = new FileWriter(file);
			CSVWriter writer = new CSVWriter(output);
			String[] header = { "schoolName", "adress", "phoneNumber", "country", "student", "grade" };
	        writer.writeNext(header);
			for(int a=0; a<i;a++) {
				 schoolName=Utility.scrapDataName.get(a);
				 adress=Utility.scrapDataAdress.get(a);
				 phoneNumber=Utility.scrapDataPhoneNumber.get(a);
				 country=Utility.scrapDataCountry.get(a);
				 student=Utility.scrapDataStudent.get(a);
				 grade=Utility.scrapDataGrade.get(a);
				String[] data = { schoolName, adress, phoneNumber, country, student, grade };

		        writer.writeNext(data);
			}
			writer.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
