package com.bitrix.stepdefinitions;

import com.bitrix.pages.AccountActivities;
import com.bitrix.pages.LoginPage;
import com.bitrix.utilities.BrowserUtils;
import com.bitrix.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TransactionDef {
    @Given("the user accesses the {string} tab")
    public void the_user_accesses_the_tab(String name) {
        AccountActivities ac=new AccountActivities();
        ac.tab(name);

    }

    @When("the user enters date range from “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void the_user_enters_date_range_from_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
    String fromdate=int1+"-"+int2+"-"+int3;
    String tomdate=int4+"-"+int5+"-"+int6;
        AccountActivities ac=new AccountActivities();
        ac.fromdate.sendKeys(fromdate);
        ac.todate.sendKeys(tomdate);


    }

    @When("clicks search")
    public void clicks_search() {
        AccountActivities ac=new AccountActivities();
        ac.summit();
    }

    @Then("results table should only show transactions dates between “{int}-{int}-{int}” to “{int}-{int}-{int}”")
    public void results_table_should_only_show_transactions_dates_between_to(Integer int1, Integer int2, Integer int3, Integer int4, Integer int5, Integer int6) {
        System.out.println();
    }

    @Then("the results should be sorted by most recent date")
    public void the_results_should_be_sorted_by_most_recent_date() {
        System.out.println();
    }

    @Then("the results table should only not contain transactions dated “{int}-{int}-{int}”")
    public void the_results_table_should_only_not_contain_transactions_dated(Integer int1, Integer int2, Integer int3) {
        System.out.println();
    }
    @When("the user enters description {string}")
    public void the_user_enters_description(String message) {

           BrowserUtils.waitFor(2);
            AccountActivities ac=new AccountActivities();
            ac.sender(message);

        }


    @Then("results table should only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String message) {

        AccountActivities ac=new AccountActivities();
        if (message==ac.descriptionsender.getText()){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }

    }


    @Then("results table should not show descriptions containing {string}")
    public void results_table_should_not_show_descriptions_containing(String message) {
        AccountActivities ac=new AccountActivities();
        if (message==ac.descriptionsender.getText()){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }

    }




    @When("the user enters description “OFFICE”")
    public void the_user_enters_description_OFFICE(String message) {
        message="OFFICE";
        AccountActivities ac=new AccountActivities();
        ac.sender(message);

    }

    @Then("results table should only show descriptions containing “OFFICE”")
    public void results_table_should_only_show_descriptions_containing_OFFICE() {
        String message="OFFICE";
        AccountActivities ac=new AccountActivities();
        if (message==ac.descriptionsender.getText()){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }
    }

    @Then("results table should not show descriptions containing “OFFICE”")
    public void results_table_should_not_show_descriptions_containing_OFFICE() {
        System.out.println();

    }

    @When("the user enters description “online”")
    public void the_user_enters_description_online(String message) {
        message="online";
        AccountActivities ac=new AccountActivities();
        if (message==ac.descriptionsender.getText()){

            System.out.println("passed");

        }else{

            System.out.println("failed");
        }

    }
    }


