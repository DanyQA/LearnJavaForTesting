package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() {
    app.getNavigationHelper().gotoGroupPage("groups");
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(new GroupData("Test", "SomeHeader", "SomeText"));
    app.getGroupHelper().sumbitGroupCreation("submit");
    //app.getNavigationHelper().returntoGroupPage("home page");
    app.getNavigationHelper().gotoGroupPage("groups");
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before+1); // Важно следить где считаются элементы!!
  }

}
