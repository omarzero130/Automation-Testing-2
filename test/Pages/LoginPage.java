/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

/**
 *
 * @author omar shalaby
 */
public class LoginPage {

    WebDriver driver;
    //constructor

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    By Usernamefield = By.id("user-name");
    By PW = By.id("password");
    By loginbutton = By.xpath("//input[@value='LOGIN']");
   
    //functions

    public void ValidLogin(String Username, String Password) {
        driver.findElement(Usernamefield).sendKeys(Username);
        driver.findElement(PW).sendKeys(Password);
        driver.findElement(loginbutton).click();
    }

}
