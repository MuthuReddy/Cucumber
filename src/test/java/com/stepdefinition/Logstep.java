package com.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logstep {
	

	WebDriver driver;
	@Given("User is on the Instagram login page")
	public void userIsOnTheInstagramLoginPage() throws InterruptedException {
		driver = new EdgeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(1000);
		
	}
	@When("User login {string},{string}")
	public void userLogin(String userName, String password) throws InterruptedException {

		WebElement textUser = driver.findElement(By.name("username"));
		textUser.sendKeys(userName);
		
		Thread.sleep(1000);
		  
		WebElement textPass = driver.findElement(By.name("password"));
		textPass.sendKeys(password);
		
		Thread.sleep(1000);
		  
		WebElement btnLoggin = driver.findElement(By.xpath("//div[text()='Log in']"));
		btnLoggin.click();

	}
	@Then("User should verify after login success message")
	public void userShouldVerifyAfterLoginSuccessMessage() {
		System.out.println("Insta Login Successful");
	}







	




}
