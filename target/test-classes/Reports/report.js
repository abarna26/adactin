$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Verifying facebook details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adatinhotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user lanuch adactinhotel page",
  "keyword": "Given "
});
formatter.step({
  "name": "As a User enter \"\u003cusername\u003e\" and \"\u003cpassword\u003e\" and click login button",
  "keyword": "When "
});
formatter.step({
  "name": "As a user verify the message",
  "keyword": "Then "
});
formatter.step({
  "name": "As a user select \"\u003clocation\u003e\" and \"\u003chotel\u003e\" and \"\u003croomtype\u003e\" and\"\u003cnoofrooms\u003e\" andclick the search button",
  "keyword": "And "
});
formatter.step({
  "name": "As a user click select and continue button",
  "keyword": "And "
});
formatter.step({
  "name": "As a user enter \"\u003cfirstname\u003e\" and\"\u003clastname\u003e\" and \"\u003caddress\u003e\" and \"\u003cccno\u003e\" and \"\u003ccctype\u003e\" and \"\u003cmonth\u003e\" and\"\u003cyear\u003e\"and\"\u003ccvvno\u003e\" and click book now button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "location",
        "hotel",
        "roomtype",
        "noofrooms",
        "firstname",
        "lastname",
        "address",
        "ccno",
        "cctype",
        "month",
        "year",
        "cvvno"
      ]
    },
    {
      "cells": [
        "Abarnaappu",
        "abi@ppu",
        "Sydney",
        "Hotel Creek",
        "Standard",
        "1 - One",
        "Abi",
        "appu",
        "Thanjavur",
        "2345665432234567",
        "VISA",
        "December",
        "2022",
        "4598"
      ]
    },
    {
      "cells": [
        "Abarnaappu",
        "abi@ppu",
        "Brisbane",
        "Hotel Sunshine",
        "Super Deluxe",
        "5 - Five",
        "Arun",
        "raj",
        "Cheenai",
        "2345686789009876",
        "American Express",
        "September",
        "2021",
        "2620"
      ]
    },
    {
      "cells": [
        "Abarnaappu",
        "abi@ppu",
        "Sydney",
        "Hotel Hervey",
        "Standard",
        "10 - Ten",
        "preethi",
        "nachi",
        "Velur",
        "2345678910987564",
        "Master Card",
        "September",
        "2021",
        "3126"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adatinhotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user lanuch adactinhotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.browserlanuch()"
});
formatter.result({
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: cannot determine loading status\nfrom disconnected: received Inspector.detached event\n  (Session info: chrome\u003d91.0.4472.124)\nBuild info: version: \u00273.5.3\u0027, revision: \u0027a88d25fe6b\u0027, time: \u00272017-08-29T12:42:44.417Z\u0027\nSystem info: host: \u0027DESKTOP-4ROS29G\u0027, ip: \u0027192.168.43.124\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_291\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities [{networkConnectionEnabled\u003dfalse, chrome\u003d{chromedriverVersion\u003d91.0.4472.101 (af52a90bf87030dd1523486a1cd3ae25c5d76c9b-refs/branch-heads/4472@{#1462}), userDataDir\u003dC:\\Users\\user\\AppData\\Local\\Temp\\scoped_dir688_578894336}, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, strictFileInteractability\u003dfalse, platform\u003dXP, proxy\u003dProxy(), goog:chromeOptions\u003d{debuggerAddress\u003dlocalhost:49682}, acceptInsecureCerts\u003dfalse, browserVersion\u003d91.0.4472.124, browserName\u003dchrome, javascriptEnabled\u003dtrue, platformName\u003dXP, setWindowRect\u003dtrue, webauthn:extension:largeBlob\u003dtrue, webauthn:virtualAuthenticators\u003dtrue}]\nSession ID: 069456bcf58ff3c2fb7492ec4aacc3e1\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:646)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:370)\r\n\tat org.base.BaseClass.lanuchUrl(BaseClass.java:46)\r\n\tat org.stepsdefinition.Loginsteps.browserlanuch(Loginsteps.java:18)\r\n\tat ✽.As a user lanuch adactinhotel page(file:src/test/resources/Features/Login.feature:4)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "As a User enter \"Abarnaappu\" and \"abi@ppu\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.as_a_User_enter_and_and_click_login_button(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.as_a_user_verify_the_message()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user select \"Sydney\" and \"Hotel Creek\" and \"Standard\" and\"1 - One\" andclick the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_select_and_and_and_andclick_the_search_button(String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user click select and continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_click_select_and_continue_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "As a user enter \"Abi\" and\"appu\" and \"Thanjavur\" and \"2345665432234567\" and \"VISA\" and \"December\" and\"2022\"and\"4598\" and click book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.clickbookbutton(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Verifying adatinhotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user lanuch adactinhotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.browserlanuch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a User enter \"Abarnaappu\" and \"abi@ppu\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.as_a_User_enter_and_and_click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.as_a_user_verify_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user select \"Brisbane\" and \"Hotel Sunshine\" and \"Super Deluxe\" and\"5 - Five\" andclick the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_select_and_and_and_andclick_the_search_button(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user click select and continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_click_select_and_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user enter \"Arun\" and\"raj\" and \"Cheenai\" and \"2345686789009876\" and \"American Express\" and \"September\" and\"2021\"and\"2620\" and click book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.clickbookbutton(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verifying adatinhotel login with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As a user lanuch adactinhotel page",
  "keyword": "Given "
});
formatter.match({
  "location": "Loginsteps.browserlanuch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a User enter \"Abarnaappu\" and \"abi@ppu\" and click login button",
  "keyword": "When "
});
formatter.match({
  "location": "Loginsteps.as_a_User_enter_and_and_click_login_button(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user verify the message",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.as_a_user_verify_the_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user select \"Sydney\" and \"Hotel Hervey\" and \"Standard\" and\"10 - Ten\" andclick the search button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_select_and_and_and_andclick_the_search_button(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user click select and continue button",
  "keyword": "And "
});
formatter.match({
  "location": "Loginsteps.as_a_user_click_select_and_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "As a user enter \"preethi\" and\"nachi\" and \"Velur\" and \"2345678910987564\" and \"Master Card\" and \"September\" and\"2021\"and\"3126\" and click book now button",
  "keyword": "Then "
});
formatter.match({
  "location": "Loginsteps.clickbookbutton(String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
});