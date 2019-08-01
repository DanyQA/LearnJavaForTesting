package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupHelper extends HelperBase {

  private ApplicationManager app;

  public GroupHelper(WebDriver driver) {
    super(driver);
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

  public void selectGroup(String select) {
    click(By.name(select));
  }

  public void initGroupModification(String edit) {
    click(By.name(edit));
  }

  public void sumbitGroupModification(String update) {
    click(By.name(update));
  }

  public void createGroup(GroupData group) {
    initGroupCreation("new");
    fillGroupForm(group);
    sumbitGroupCreation("submit");

  }

  public boolean isThereAGroup() {
    return isElementPresent(By.name("selected[]"));
  }

  public int getGroupCount() {
    return driver.findElements(By.name("selected[]")).size();
  }
}
