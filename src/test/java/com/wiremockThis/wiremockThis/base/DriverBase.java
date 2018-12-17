package com.wiremockThis.wiremockThis.base;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;

public class DriverBase {

  public WebDriver getDriver(){
    return WebDriverRunner.getWebDriver();
  }

}
