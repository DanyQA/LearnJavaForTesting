package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver driver) {
    super(driver);
  }

  public void fillContactForm(String firstname, String lastname, String nickname, String company, String email, String b_day, String b_month, String b_year, String note) {
    complete(firstname, "firstname");
    complete(lastname, "lastname");
    complete(nickname, "nickname");
    complete(company, "company");
    complete(email, "email");
    select(b_day, "bday");
    select(b_month, "bmonth");
    complete(b_year, "byear");
    complete(note, "notes");
    saveContact(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
  }

}
