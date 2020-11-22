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
import Pages.PaymentPage;
import Pages.ShoppingPage;
import static TestBase1.TestBase.ChromebrowserObject;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.AfterTest;

/**
 *
 * @author omar shalaby
 */
public class Payment extends TestBase {

    public Payment() throws IOException {
        super();
    }

    @Test
    public void addtocart() {
        //ChromeBroswerObject.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

        PaymentPage Pay = new PaymentPage(ChromebrowserObject);
        //WebElement btn = ChromeBroswerObject.findElement(By.xpath("//div[@class='inventory_item'][1]//button[@class='btn_primary btn_inventory']"));
        //btn.click();
        Pay.Checkoutpayment();

    }
    @AfterTest
    public  void CloseBrowser(){
        ClosingBrowser();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
