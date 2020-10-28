$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PayBills.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "user pays bills positive scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@paybills"
    }
  ]
});
formatter.step({
  "name": "user webpage and sign in",
  "keyword": "Given "
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "And "
});
formatter.step({
  "name": "user press Pay Bills button",
  "keyword": "When "
});
formatter.step({
  "name": "the user fills form \"\u003cAmount\u003e\",\"\u003cDate\u003e\" and \"\u003cDescription\u003e\"",
  "keyword": "Given "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Amount",
        "Date",
        "Description"
      ]
    },
    {
      "cells": [
        "100",
        "2020 12 09",
        "first payment"
      ]
    }
  ]
});
formatter.scenario({
  "name": "user pays bills positive scenario",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@paybills"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user webpage and sign in",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.Login.user_webpage_and_sign_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs in with valid credentials",
  "keyword": "And "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.Login.user_logs_in_with_valid_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user press Pay Bills button",
  "keyword": "When "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.PayBills.user_press_Pay_Bills_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user fills form \"100\",\"2020 12 09\" and \"first payment\"",
  "keyword": "Given "
});
formatter.match({
  "location": "com.bitrix.stepdefinitions.PayBills.the_user_fills_form_and(java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});