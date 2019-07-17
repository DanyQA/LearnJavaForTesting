package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionsTests extends TestBase {

  @Test
  public void testGroupDeletion() throws Exception {
    app.getNavigationHelper().gotoGroupPage("groups");
    app.getGroupHelper().selectGroup("selected[]");
    app.getGroupHelper().deleteSelectedGroups("delete");
    app.getGroupHelper().returntoGroupPage();
  }

}
