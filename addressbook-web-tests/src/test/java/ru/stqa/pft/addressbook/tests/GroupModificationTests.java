package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage("groups");
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("DeleteTest", "SomeHeader", "SomeText"));
      app.getNavigationHelper().gotoGroupPage("groups");
    }
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().initGroupModification("edit");
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroupForKatalon", "TestText", "SomeText"));
    app.getGroupHelper().sumbitGroupModification("update");
    app.getNavigationHelper().returntoGroupPage("home page");

    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after, before);

  }

}
