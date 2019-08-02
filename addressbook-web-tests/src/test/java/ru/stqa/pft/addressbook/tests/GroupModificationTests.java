package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupModificationTests extends TestBase {

  @Test
  public void testGroupModification(){
    app.getNavigationHelper().gotoGroupPage("groups");
    if (! app.getGroupHelper().isThereAGroup()){
      app.getGroupHelper().createGroup(new GroupData("DeleteTest", "SomeHeader", "SomeText"));
      app.getNavigationHelper().gotoGroupPage("groups");
    }
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().selectGroup(before.size()-1);
    app.getGroupHelper().initGroupModification("edit");
    GroupData group = new GroupData(before.get(before.size()-1).getId(),"test1", "TestText", "SomeText");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().sumbitGroupModification("update");
    app.getNavigationHelper().returntoGroupPage("home page");
    List<GroupData> after = app.getGroupHelper().getGroupList();
    assertEquals(after.size(), before.size());

    before.remove(before.size()-1);
    before.add(group);
    assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }

}
