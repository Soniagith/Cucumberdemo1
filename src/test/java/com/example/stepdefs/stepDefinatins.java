package com.example.stepdefs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class stepDefinatins {
	WebDriver driver= null;
	
@Given("browser window is open")
public void browser_window_is_open() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
    
}

@And("Enter url")
public void enter_url() {
 driver.navigate().to("https://www.google.com/");
}

@When("Google is opened")
public void google_is_opened() {
	
  String title=driver.getTitle();
  System.out.println(title);
}

@Then("search {string} with google")
public void search_selenium_with_google(String  string) {
	driver.findElement(By.name("q")).sendKeys(string);
}

@And("click Enter")
public void click_enter() {
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	driver.close();
	driver.quit();
}

}
