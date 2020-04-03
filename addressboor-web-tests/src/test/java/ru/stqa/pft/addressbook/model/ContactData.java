package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String mobilePhone;
  private final String email;

  public ContactData(String firstname, String lastname, String mobilePhone, String email) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.mobilePhone = mobilePhone;
    this.email = email;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getEmail() {
    return email;
  }
}
