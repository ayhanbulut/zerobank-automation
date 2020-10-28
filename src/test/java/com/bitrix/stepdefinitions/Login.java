package com.bitrix.stepdefinitions;

import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {

    @Given("user webpage and sign in")
    public void user_webpage_and_sign_in() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
       Driver.get().findElement(By.id("signin_button")).click();


    }

    @When("user logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        LoginPage loginPage=new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);



    }

    @Then("Account summary page should be displayed")
    public void account_summary_page_should_be_displayed() {
        BrowserUtils.waitFor(2);
    WebElement actual=Driver.get().findElement(By.id("account_summary_tab"));

        Assert.assertTrue(actual.isDisplayed());

    }
    @Then("if user credentials is not correct")
    public void if_user_credentials_is_not_correct() {

        Driver.get().findElement(By.xpath("//*[@id=\"settingsBox\"]/ul/li[3]/ul")).click();



      Driver.get().findElement(By.id("logout_link")).click();

      BrowserUtils.waitFor(1);

        LoginPage loginPage=new LoginPage();
        String username=ConfigurationReader.get("username");
        String password=ConfigurationReader.get("");
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);

        WebElement message=Driver.get().findElement(By.xpath("//*[@id=\"login_form\"]/div[1]"));
        String Actual=message.getText();
        String Expected="Login and/or password are wrong.";

        Assert.assertEquals(Expected,Actual);


    }
}
