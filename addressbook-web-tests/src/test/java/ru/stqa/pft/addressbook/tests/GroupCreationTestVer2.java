package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() {
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("Test", "SomeHeader", "SomeText");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().sumbitGroupCreation("submit");
    //app.getNavigationHelper().returntoGroupPage("home page");
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size()+1); // Важно следить где считаются элементы!!

    int max = 0;
    for (GroupData g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }
    group.setId(max);
    before.add(group);

    assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));

  }

}
