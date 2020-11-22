/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///a[@class="btn_action checkout_button"]
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
public class CheckOutPage {

    WebDriver driver;
    JavascriptExecutor jse;
    Actions action;

    public CheckOutPage(WebDriver driver) {
        this.driver = driver;
    }
    By CheckoutBtn = By.xpath("//a[@class='btn_action checkout_button']");
    By Firstname = By.xpath("//input[@id='first-name']");
    By Lastname = By.xpath("//input[@id='last-name']");
    By zipCode = By.xpath("//input[@id='postal-code']");
    By contiueBtn = By.xpath("//input[@class='btn_primary cart_button']");

    public void Checkout() {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)", "");
        driver.findElement(CheckoutBtn).click();
    }

   /* public void CheckoutInfo(String firstname, String lastname, String zipcode) {
        driver.findElement(Firstname).sendKeys(firstname);
        driver.findElement(Firstname).sendKeys(lastname);
        driver.findElement(Firstname).sendKeys(zipcode);
        driver.findElement(contiueBtn).click();

    }*/
}
