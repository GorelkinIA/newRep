package ru.stqa.pft.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.TestBase;
import ru.stqa.pft.addressbook.model.ContactData;


public class ContactDeletionTests extends TestBase{


  @Test
  public void deleteContact() {
    app.getNavigationHelper().gotoHomePage();
    if (! app.getContactHelper().isTheareAContact()) {
      app.getContactHelper().CreateContact(new ContactData("firstname", "lastname",
              "89039035555", "mail@mail.ru", null), true);
    }
    int before = app.getContactHelper().getContactCount();
    app.getContactHelper().selectContact(before -1);
    app.getContactHelper().deleteSelectedContact();
    int after = app.getContactHelper().getContactCount();
    Assert.assertEquals(after,before -1);
  }
}
