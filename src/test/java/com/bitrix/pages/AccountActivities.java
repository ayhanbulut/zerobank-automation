package com.bitrix.pages;

import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import com.bitrix.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AccountActivities extends BasePage {


    @FindBy(xpath = "//*[@id=\"tabs\"]/ul/li[2]")
    public WebElement TransactionTab;

    @FindBy(xpath = "//*[@id=\"tabs\"]/ul/li[1]")
    public WebElement ShowTab;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    public WebElement summit;

  @FindBy(id = "aa_fromDate")
  public WebElement fromdate;

    @FindBy(id = "aa_toDate")
    public WebElement todate;

@FindBy(id = "aa_description")
public WebElement descriptionsender;

    public void AccountActivity() {

        WebElement aa = Driver.get().findElement(By.id("account_activity_tab"));
        aa.click();
    }

    public static List<String> getElementsText(By locator) {

        List<WebElement> elems = Driver.get().findElements(locator);
        List<String> elemTexts = new ArrayList<>();

        for (WebElement el : elems) {
            elemTexts.add(el.getText());
        }
        return elemTexts;
    }

    public void tab(String name){


        LoginPage loginPage=new LoginPage();
        String username= ConfigurationReader.get("username");
        String password=ConfigurationReader.get("password");
        loginPage.login(username,password);
        BrowserUtils.waitFor(2);

        WebElement ac=Driver.get().findElement(By.id("account_activity_tab"));
        ac.click();

       BrowserUtils.waitFor(2);

        if (name.contentEquals("Find Transactions")){

           TransactionTab.click();
            System.out.println("passed");


        }else if (name=="Show Transactions"){

            ShowTab.click();
        }

       }
       public void summit(){

          summit.click();
    }

    public void fromdates(String a){

        fromdate.sendKeys(a);
    }
    public void todates(String a){

        todate.sendKeys(a);
}
public void sender(String message){

      //message= message.toUpperCase();
         descriptionsender.sendKeys(message);

}
}