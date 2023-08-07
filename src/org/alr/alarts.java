package org.alr;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class alarts {
	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\SABARINATHAN\\eclipse-workspace\\alart\\driver\\msedgedriver.exe");
		WebDriver v = new EdgeDriver();
		v.get("https://demo.automationtesting.in/Alerts.html");
		v.manage().window().maximize();
		WebElement al = v.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		al.click();

		WebElement ad = v.findElement(By.xpath("//button[contains(text(),'prompt')]"));
		ad.click();

		Alert s = v.switchTo().alert();
		
		s.sendKeys("sabari");
		String text = s.getText();
		System.out.println(text);
		s.accept();
	}
}
