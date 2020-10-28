package com.bitrix.stepdefinitions;

import com.bitrix.pages.AccountActivities;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountActivity {

    @When("user click to {string} button")
    public void user_click_to_button(String button) {

        WebElement ac=Driver.get().findElement(By.id("account_activity_tab"));
        String actual= ac.getText();
        Assert.assertEquals(actual,button);
        ac.click();

    }

    @When("user click on {string} to dropdown to verify on {string} button appeared")
    public void user_click_on_to_dropdown_to_verify_on_button_appeared(String Account, String expected) {

        WebElement account= Driver.get().findElement(By.xpath("//*[@id=\"aa_accountId\"]/option[1]"));

        String ac= account.getText();

        Assert.assertEquals(ac,expected);
////*[@id="aa_accountId"]/option[3]

    }
    @When("user sees following options on the Account dropdown")
    public void user_sees_following_options_on_the_Account_dropdown(List<String> dropdownoption) {

        List<WebElement> accounts= Driver.get().findElements(By.xpath("//*[@id=\"aa_accountId\"]/option"));

       int accountnum= accounts.size();

        System.out.println(accountnum);

        List<String>  Actual=new ArrayList<>();

        for (int i = 1; i <= accountnum; i++) {
           Actual.add(Driver.get().findElement(By.xpath("//*[@id=\"aa_accountId\"]/option["+i+"]")).getText());

        }


        Assert.assertEquals(dropdownoption,Actual);
        System.out.println("dropdownoption = " + dropdownoption);
        System.out.println("Actual = " + Actual);

    }



    @Then("user gets some transactions information")
    public void user_gets_some_transactions_information() {

    List<WebElement> elements=Driver.get().findElements(By.xpath("//*[@id='all_transactions_for_account']/table/thead/tr/th"));
  //  BrowserUtils.waitFor(2);
   int num= elements.size();
        System.out.println(num);


    List<String>  actual= new ArrayList<>();

        for (int i = 1; i <=4; i++) {
            BrowserUtils.waitFor(2);
            actual.add(Driver.get().findElement(By.xpath("//*[@id='all_transactions_for_account']/table/thead/tr/th["+i+"]")).getText());

        }

        List<String> Expected=new ArrayList<>();
        Expected.add("Date");
        Expected.add("Description");
        Expected.add("Deposit");
        Expected.add("Withdrawal");

        Assert.assertEquals(Expected,actual);
    }

}
