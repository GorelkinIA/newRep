package ru.stqa.pft.addressbook.tests;// Generated by Selenium IDE

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.TestBase;


public class ContactCreationTests extends TestBase {


  @Test
  public void testContactCreation() {
    app.getNavigationHelper().gotoHomePage();
    int before = app.getContactHelper().getContactCount();
    System.out.println("Пипец какой то");
    app.getContactHelper().CreateContact(new ContactData("firstname", "lastname",
            "89039035555", "mail@mail.ru", null), true);
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before +1);
  }
}
