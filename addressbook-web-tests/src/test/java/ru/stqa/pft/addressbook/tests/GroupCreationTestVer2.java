package ru.stqa.pft.addressbook.tests;


import org.testng.Assert;
import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.GroupData;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() {
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("Test05.08", "SomeHeader", "SomeText");
    app.getGroupHelper().initGroupCreation("new");
    app.getGroupHelper().fillGroupForm(group);
    app.getGroupHelper().sumbitGroupCreation("submit");
    //app.getNavigationHelper().returntoGroupPage("home page");
    app.getNavigationHelper().gotoGroupPage("groups");
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size()+1); // Важно следить где считаются элементы!!

    /*int max = 0;
    for (GroupData g : after) {
      if (g.getId() > max) {
        max = g.getId();
      }
    }*/ //старый метод вычисления максимального циклом

    //Новый метод вычисления максимального значения
    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(), o2.getId())).get().getId());
    before.add(group);
    Comparator<? super GroupData> byId = (g1, g2) -> Integer.compare(g1.getId(), g2.getId());
    before.sort(byId);
    after.sort(byId);
    Assert.assertEquals(before, after);
  }

}
