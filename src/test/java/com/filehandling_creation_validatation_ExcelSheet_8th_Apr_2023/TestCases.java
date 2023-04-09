package com.filehandling_creation_validatation_ExcelSheet_8th_Apr_2023;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCases {

	public WebDriver driver;

	@Test(priority = 1, enabled = true)
	public static void createNewSheet() throws IOException {
		String filePath = (System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\filehandling_creation_validatation_ExcelSheet_8th_Apr_2023\\ExcelRegisterTNData.xlsx");
		String sheetName = "Login";

		FileInputStream inputStream = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(inputStream);

		workbook.createSheet(sheetName);

		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}

	@Test(priority = 2, enabled = true)
	public static void writeDataToTheNewlyCreatedExcelSheet() throws Exception {
		String filePath = (System.getProperty("user.dir")
				+ "\\src\\test\\java\\com\\filehandling_creation_validatation_ExcelSheet_8th_Apr_2023\\ExcelRegisterTNData.xlsx");
		String sheetName = "Login";
		String[] username = { "seleniumpanda11@gmail.com", "seleniumpanda12@gmail.com" };
		String[] password = { "Selenium@123", "Selenium@123" };

		FileInputStream inputStream = new FileInputStream(filePath);
		Workbook workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheet(sheetName);

		int rowNum = 0;
		Row row = sheet.createRow(rowNum++);
		Cell usernameCell = row.createCell(0);
		usernameCell.setCellValue("username");
		Cell passwordCell = row.createCell(1);
		passwordCell.setCellValue("password");

		for (int i = 0; i < username.length; i++) {
			row = sheet.createRow(rowNum++);
			usernameCell = row.createCell(0);
			usernameCell.setCellValue(username[i]);
			passwordCell = row.createCell(1);
			passwordCell.setCellValue(password[i]);
		}

		FileOutputStream outputStream = new FileOutputStream(filePath);
		workbook.write(outputStream);
		workbook.close();
		outputStream.close();
	}

	@Test(enabled = true, priority = 3, dataProvider = "TNLogin", dataProviderClass = ExcelData_DataProvider.class)
	public void validateTheDataCreated(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
	
	
}
