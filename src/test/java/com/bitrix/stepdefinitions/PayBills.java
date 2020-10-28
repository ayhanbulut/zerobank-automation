package com.bitrix.stepdefinitions;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PayBills {

    @When("user press Pay Bills button")
    public void user_press_Pay_Bills_button() {
       Driver.get().findElement(By.id("pay_bills_tab")).click();
    }

    @Given("the user fills form {string},{string} and {string}")
    public void the_user_fills_form_and(String amount, String date, String description) {


        WebElement  Amount=Driver.get().findElement(By.id("sp_amount"));
        Amount.sendKeys(amount);

        WebElement  Date=Driver.get().findElement(By.id("sp_date"));
        Date.sendKeys(date);

        BrowserUtils.waitFor(5);
        WebElement  Description=Driver.get().findElement(By.id("sp_description"));
        Description.sendKeys(description);

        Driver.get().findElement(By.id("pay_saved_payees")).click();
        String Actual=Driver.get().findElement(By.xpath("//*[@id=\"alert_content\"]/span")).getText();
        String Expected="The payment was successfully submitted.";
        Assert.assertEquals(Expected,Actual);



        }


    @Given("the user fills form {string},{string}")
    public void the_user_fills_form(String string, String string2) {

        Driver.get().findElement(By.id("pay_saved_payees")).click();

       String Actualmessage=Driver.get().findElement(By.id("sp_amount")).getAttribute("validationMessage");

       String ExpectedMessage="Please fill in this field.";

       Assert.assertEquals(ExpectedMessage,Actualmessage);

    }

}
