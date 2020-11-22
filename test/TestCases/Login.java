/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCases;

import org.openqa.selenium.WebDriver;

import java.io.IOException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import TestBase1.TestBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import org.testng.Assert;
import Pages.LoginPage;

/**
 *
 * @author omar shalaby
 */
public class Login extends TestBase {

    public WebDriver ChromeBroswerObject;
    public JavascriptExecutor jse;
    Actions action;

    public Login() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

    @BeforeTest
    public void Openbroswer() {
        Openingbroswer();
    }

    @Test(priority = 1)
    public void LoginTC() {
        LoginPage LoginPageObject = new LoginPage(ChromebrowserObject);
        LoginPageObject.ValidLogin("standard_user", "secret_sauce"); // should also be readed from properties file
    }

    @Test(dependsOnMethods = {"LoginTC"})
    public void VerifyLoginTC() {
        WebElement ProductTitle = ChromebrowserObject.findElement(By.xpath("//div[@class='product_label']"));
        String ActualValue = ProductTitle.getText();
        Assert.assertEquals(ActualValue, "Products");

    }


    /*  public Login() {
    }*/
    // jse = (JavascriptExecutor) ChromeBroswerObject;
    // jse.executeScript("window.scrollBy(0,750)", "");
    //button[@class='btn_primary btn_inventory'][1]
    // action = new Actions(ChromeBroswerObject);
    //action.moveToElement(ChromeBroswerObject.findElement(By.xpath("//ul[@id='homefeatured']/li[position() = 1]"))).build().perform();
    // action = new Actions(ChromeBroswerObject);
    // action.moveToElement(ChromeBroswerObject.findElement(By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']"))).build().perform();
    // ShoppingPage shpPage = new ShoppingPage(ChromeBroswerObject);
    //  shpPage.AddItemtoCart();
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
