package ru.stqa.pft.addressbook;


import org.testng.annotations.*;

public class GroupCreationTestVer2 extends TestBase {

  @Test
  public void testGroupCreationTestVer2() throws Exception {
    gotoGroupPage("groups");
    initGroupCreation("new");
    fillGroupForm(new GroupData("NewGroupForKatalon", "TestText", "SomeText"));
    sumbitGroupCreation("submit");
    returntoGroupPage();
    gotoGroupPage("groups");
  }

}
