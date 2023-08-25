package com.Browser.project;

import java.time.Duration;

import org.openqa.selenium.WebDriver; import org.openqa.selenium.chrome.ChromeDriver;

public class browseropen {

public static void main(String[] args) {
	try {
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chitti\\Desktop\\saritha\\chromedriver.exe");
		 Thread.sleep(3000);
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	} catch (InterruptedException e) {
				e.printStackTrace();
	
	}
	
	}

