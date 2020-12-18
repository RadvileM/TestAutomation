package testData;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import BaseTest.BaseTest;
import page.MainPage;
import page.SearchPage;
import util.fileReader;

public class testTextReader extends BaseTest{
	
	private MainPage mainPage = new MainPage(driver);
	private SearchPage searchPage = new SearchPage(driver);

	//metodas nuskaitantis test data
	
	@Test
	public void test() throws IOException { //issikvieciam metoda is fileReader klases
		List<String> testData = fileReader.getTestData("src/test/resources/text.txt");
		
		//istraukiam data is text.txt failo, pirma elementa
		String productName = testData.get(0);
		
		//issiskieciam metoda is mainPage
		mainPage.writeInputSearch(productName);
		mainPage.clickButtonSearch();
		
		//issiskvieciam metoda is SearchPAge
		String actualResult = searchPage.getTextFromLinkFirstItem();
		
		//lyginam ar sutampa tekstas
		assertEquals("error text", productName, actualResult);
	}
	
	
	
}
