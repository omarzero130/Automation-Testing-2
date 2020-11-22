/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

/**
 *
 * @author omar shalaby
 */
public class CheckOutFormPage {

    WebDriver driver;
    JavascriptExecutor jse;
    Actions action;

    public CheckOutFormPage(WebDriver driver) {
        this.driver = driver;
    }
    By Firstname = By.xpath("//input[@id='first-name']");
    By Lastname = By.xpath("//input[@id='last-name']");
    By zipCode = By.xpath("//input[@id='postal-code']");
    By contiueBtn = By.xpath("//input[@class='btn_primary cart_button']");

    public void CheckoutForm(String firstname, String lastname, String zipcode) {
        driver.findElement(Firstname).sendKeys(firstname);
        driver.findElement(Lastname).sendKeys(lastname);
        driver.findElement(zipCode).sendKeys(zipcode);
        driver.findElement(contiueBtn).click();
    }
}
