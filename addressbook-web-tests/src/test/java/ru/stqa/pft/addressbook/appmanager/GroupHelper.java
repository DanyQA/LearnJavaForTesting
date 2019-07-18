package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  public GroupHelper(WebDriver driver) {
    super(driver);
  }

  public void returntoGroupPage() {
    click(By.linkText("group page"));
  }

  public void sumbitGroupCreation(String submit) {
    click(By.name(submit));
  }

  public void fillGroupForm(GroupData groupData) {
    type("group_name", groupData.getName());
    type("group_header", groupData.getHeader());
    type("group_footer", groupData.getFooter());
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Groups'])[1]/following::form[1]"));
  }

  public void initGroupCreation(String s) {
    click(By.name(s));
  }

  public void deleteSelectedGroups(String delete) {
    click(By.name(delete));
  }

  public void selectGroup(String s) {
    click(By.name(s));
  }
}
