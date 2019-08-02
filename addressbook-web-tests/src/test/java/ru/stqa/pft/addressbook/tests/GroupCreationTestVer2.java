package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.List;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() {
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("Test", "SomeHeader", "SomeText"));
    app.getGroupHelper().sumbitGroupCreation("submit");
    //app.getNavigationHelper().returntoGroupPage("home page");
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size()+1); // Важно следить где считаются элементы!!
  }

}
