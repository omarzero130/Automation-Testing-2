/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *///a[@class="btn_action cart_button"]
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
public class PaymentPage {

    WebDriver driver;
    JavascriptExecutor jse;
    Actions action;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
    }
    By FinishBtn = By.xpath("//a[@class='btn_action cart_button']");

    public void Checkoutpayment() {
        jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,750)", "");
        driver.findElement(FinishBtn).click();
    }

    /* public void CheckoutInfo(String firstname, String lastname, String zipcode) {
        driver.findElement(Firstname).sendKeys(firstname);
        driver.findElement(Firstname).sendKeys(lastname);
        driver.findElement(Firstname).sendKeys(zipcode);
        driver.findElement(contiueBtn).click();

    }*/
}
