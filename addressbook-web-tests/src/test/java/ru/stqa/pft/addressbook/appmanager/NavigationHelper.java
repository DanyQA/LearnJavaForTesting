package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase{
  private WebDriver driver;

  public NavigationHelper(WebDriver driver) {
    super(driver);
  }

  public void gotoGroupPage(String groups) {
   // if (isElementPresent(By.tagName("h1"))
   //         && driver.findElement(By.tagName("h1")).getText().equals("Groups")
   //         && isElementPresent(By.name("new"))) {
   //   return;
   // }
    click(By.linkText(groups));
  }

  public void gotoAddNewContact(String s) {
    click(s);
  }

  public void click(String s) {
    driver.findElement(By.linkText(s)).click();
  }

  public void returntoGroupPage(String home_page) {
    if (isElementPresent(By.id("maintable"))){
      return;
    }
    click(By.linkText("group page"));
  }
}
