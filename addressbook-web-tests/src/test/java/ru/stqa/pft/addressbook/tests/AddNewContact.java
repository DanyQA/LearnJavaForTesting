package ru.stqa.pft.addressbook.tests;



import org.testng.annotations.*;

public class AddNewContact extends TestBase {


  @Test
  public void testAddNewContact() {
    app.getNavigationHelper().gotoAddNewContact("add new");
    app.getContactHelper().fillContactForm("Daniil", "Babich", "D@nilQA", "ONDOC", "danil@ya.ru", "15", "May", "1993", "#3");
    app.getNavigationHelper().returntoGroupPage("home page");
  }
}
