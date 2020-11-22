/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCases;

import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import TestBase1.TestBase;
import java.io.IOException;
import Pages.CheckOutPage;
import Pages.LoginPage;
import Pages.ShoppingPage;
import static TestBase1.TestBase.ChromebrowserObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author omar shalaby
 */
public class Checkout extends TestBase {

    public WebDriver ChromeBroswerObject;
    public JavascriptExecutor jse;
    Actions action;

    public Checkout() throws IOException {
        super();
        // TODO Auto-generated constructor stub
    }

    @Test
    public void GoToCart() {
        ShoppingPage shp = new ShoppingPage(ChromebrowserObject);
        //WebElement btn = ChromeBroswerObject.findElement(By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']"));
        //btn.click();
        shp.OpenCart();

    }

    @Test
    public void CheckOut() {
        CheckOutPage Chk = new CheckOutPage(ChromebrowserObject);
        Chk.Checkout();// should also be readed from properties file
    }
    /*  @Test
    public void CheckOutInfo() {
        CheckOut Chk = new CheckOut(ChromebrowserObject);
        Chk.CheckoutInfo("Omar", "Mohamed", "43518");// should also be readed from properties file
    }*/

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
