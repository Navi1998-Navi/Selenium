package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Class {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","H:\\Selenium\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.id("email")).sendKeys("naveenksgit15@gmail.com");
		
	}

}
