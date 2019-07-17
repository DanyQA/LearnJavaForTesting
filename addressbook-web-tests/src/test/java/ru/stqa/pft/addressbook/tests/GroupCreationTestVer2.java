package ru.stqa.pft.addressbook.tests;


import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroupForKatalon", "TestText", "SomeText"));
    app.getGroupHelper().sumbitGroupCreation("submit");
    app.getGroupHelper().returntoGroupPage();
    app.getNavigationHelper().gotoGroupPage("groups");
  }

}
