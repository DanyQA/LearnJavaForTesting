package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().initGroupModification("edit");
    app.getGroupHelper().fillGroupForm(new GroupData("NewGroupForKatalon", "TestText", "SomeText"));
    app.getGroupHelper().sumbitGroupModification("update");
    app.getGroupHelper().returntoGroupPage();
  }

}
