package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String nickname;
  private final String company;
  private final String email;
  private final String b_day;
  private final String b_month;
  private final String b_year;
  private final String note;

  public ContactData(String firstname, String lastname, String nickname, String company, String email, String b_day, String b_month, String b_year, String note) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.nickname = nickname;
    this.company = company;
    this.b_day = b_day;
    this.b_month = b_month;
    this.b_year = b_year;
    this.note = note;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getNickname() {
    return nickname;
  }

  public String getCompany() {
    return company;
  }

  public String getEmail() {
    return email;
  }

  public String getB_day() {
    return b_day;
  }

  public String getB_month() {
    return b_month;
  }

  public String getB_year() {
    return b_year;
  }

  public String getNote() {
    return note;
  }
}
