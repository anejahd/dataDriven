package excelDataProvider.dataDriven;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvide {
	
	@Test(dataProvider="driveTest")
	public void testcaseData(String greeting, String communication, int id) {
		System.out.println(greeting+communication+id);
	}
	
	@DataProvider(name="driveTest")
	public Object[][]getData(){
		Object[][] data= {{"hello", "test", 1}, {"bye", "message", 143}, {"solo", "call", 453}};
		return data;
	}
		
	

}
