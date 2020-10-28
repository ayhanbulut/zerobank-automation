package com.bitrix.stepdefinitions;

import com.bitrix.pages.DashboardPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AccountSummary {

    @When("account page should have account types")

    public void account_page_should_have_account_types() {
        List<WebElement> accountTypes = Driver.get().findElements(By.xpath("//*[@class=\"board-header\"]"));
        //List<String> texts=accountTypes.stream().map(WebElement::getText).collect(Collectors.toList());

        List<String> Actual=new ArrayList<>();

        for (WebElement accountType : accountTypes) {
            Actual.add(accountType.getText());

        }
        List<String> Lists=new ArrayList<>();

       Lists.add("Cash Accounts");
       Lists.add("Investment Accounts");
       Lists.add("Credit Accounts");
       Lists.add("Loan Accounts");

        Assert.assertEquals(Lists,Actual);

        }


    @Then("the user should see following options under Credit accounts")
    public void the_user_should_see_following_options_under_Credit_accounts(List<String> menuOptions) {
            BrowserUtils.waitFor(2);
            //get the list of webelement and convert them to list of string and assert
        List<String > Actual=new ArrayList<>();
        Actual.add(Driver.get().findElement(By.xpath("html/body//div[3]/div/table/thead/tr/th[1]")).getText());
        Actual.add(Driver.get().findElement(By.xpath("html/body//div[3]/div/table/thead/tr/th[2]")).getText());
        Actual.add(Driver.get().findElement(By.xpath("html/body//div[3]/div/table/thead/tr/th[3]")).getText());


            Assert.assertEquals(menuOptions,Actual);
            System.out.println("menuOptions = " + menuOptions);
            System.out.println("Actual = " + Actual);

    }
}
