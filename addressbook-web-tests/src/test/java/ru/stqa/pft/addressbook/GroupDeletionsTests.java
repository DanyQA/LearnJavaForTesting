package ru.stqa.pft.addressbook;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GroupDeletionsTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    gotoGroupPage("groups");
    selectGroup("selected[]");
    deleteSelectedGroups("delete");
    returntoGroupPage();
  }

}
