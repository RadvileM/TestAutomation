package testData;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.List;

import org.junit.Test;

import BaseTest.BaseTest;
import models.ShopItem;
import page.MainPage;
import page.SearchPage;
import util.fileReader;

public class testXMLReader extends BaseTest{
	
	private MainPage mainPage = new MainPage(driver);
	private SearchPage searchPage = new SearchPage(driver);

	//metodas nuskaitantis test data
	
	@Test
	public void test() throws IOException { 
		ShopItem item = new ShopItem();
		item.setName("iPhone");
		item.setBrand("Apple");
		item.setPrice("100");
		
fileReader.writeStringToFile(item, "testFile"); //iraso i faila testFile,paima is fileReaders metoda

ShopItem iPhone = fileReader.readFileToString("testFile");

mainPage.writeInputSearch(iPhone.getName());
mainPage.clickButtonSearch();

String actualResult = searchPage.getTextFromLinkFirstItem();

assertEquals("error message", iPhone.getName(), actualResult);

	
	}
	
	
	
}
