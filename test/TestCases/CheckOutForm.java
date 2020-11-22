/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCases;

import static org.testng.Assert.*;
import static org.testng.Assert.*;

import org.openqa.selenium.WebDriver;
import static org.testng.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import TestBase1.TestBase;
import java.io.IOException;
import Pages.CheckOutFormPage;
import Pages.LoginPage;
import static TestBase1.TestBase.ChromebrowserObject;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;

/**
 *
 * @author omar shalaby
 */
public class CheckOutForm extends TestBase {

    public WebDriver ChromeBroswerObject;
    public JavascriptExecutor jse;
    Actions action;

    public CheckOutForm() throws IOException {
        super();
    }

    @Test
    public void FormCheckout() {
        CheckOutFormPage Chk = new CheckOutFormPage(ChromebrowserObject);
        Chk.CheckoutForm("Omar", "Mohamed", "43518");// should also be readed from properties file
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
