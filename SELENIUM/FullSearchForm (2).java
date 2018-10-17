package com.lps.functinal.selenium.pages;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lps.functinal.selenium.basetest.TestBase;
import com.lps.functinal.selenium.util.TestUtil;

public class FullSearchForm extends TestBase {

	@FindBy(name = "cs_name")
	WebElement company;

	@FindBy(xpath = "//input[@type='submit' and @value='Search Companies']")
	WebElement searchCompanies;

	@FindBy(className = "datacard")
	WebElement dataCardTableName;

	@FindBy(xpath = "//i[@class='fa fa-trash-o' and @title='Delete']")
	WebElement deleteCompany;

	public FullSearchForm() {
		PageFactory.initElements(driver, this);
	}

	public void navigateToFullSearchForm() {

	}

	public void deleteCompany(String companyName) throws InterruptedException {
		WebElement table = driver.findElement(By.className("datacard"));
		java.util.List<WebElement> allRows = table.findElements(By.tagName("tr"));
		outer: for (int i = 0; i < allRows.size(); i++) {
			List<WebElement> allCols = table.findElements(By.tagName("td"));
			for (int j = 0; j < allCols.size(); j++) {
				for (WebElement col : allCols) {
					String company = col.getText();
					System.out.println("Company is..."+company);
					if (company.equals(company)) {
						deleteCompany.click();
						driver.switchTo().alert().accept();
						Thread.sleep(3000);
						break outer;
					}
				}
			}
		}
	}

	public void searchByCompanyName(String companyName) throws InterruptedException {
		TestUtil.waitFor(searchCompanies, 30);
		company.sendKeys(companyName);
		searchCompanies.click();
	}
}
