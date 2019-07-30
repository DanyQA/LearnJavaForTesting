package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperBase {
  protected WebDriver driver;

  public HelperBase(WebDriver driver) {
    this.driver = driver;
  }

  protected void click(By name) {
    driver.findElement(name).click();
  }

  protected void type(String group_name, String name) {
    if (name != null) {
      type(name, By.name(group_name));
    } else {

    }
  }

  protected void type(String name, By locator) {
    click(locator);
    if (name != null) {
      String existingText = driver.findElement(locator).getAttribute("value");
      if (! name.equals(existingText)) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(name);
      }
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }


  public void complete(String firstname, String firstname2) {
    driver.findElement(By.name(firstname2)).click();
    driver.findElement(By.name(firstname2)).clear();
    driver.findElement(By.name(firstname2)).sendKeys(firstname);
  }

  public void saveContact(By xpath) {
    driver.findElement(xpath).click();
  }

  public void select(String b_day, String bday) {
    driver.findElement(By.name(bday)).click();
    new Select(driver.findElement(By.name(bday))).selectByVisibleText(b_day);
    driver.findElement(By.name(bday)).click();
  }

  public void gotoAddNewContact(String s) {
    driver.findElement(By.linkText(s)).click();
  }
}

