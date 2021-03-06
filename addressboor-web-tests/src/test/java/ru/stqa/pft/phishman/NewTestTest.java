package ru.stqa.pft.phishman;// Generated by Selenium IDE

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class NewTestTest {
  private WebDriver wd;

  @BeforeMethod
  public void setUp() {
    wd = new ChromeDriver();
    wd.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    wd.get("http://test1-edu.phishman.ru/login");
    wd.findElement(By.id("username")).click();
    wd.findElement(By.id("username")).sendKeys("");
    wd.findElement(By.id("password")).sendKeys("");
    wd.findElement(By.id("_submit")).click();

  }
  @AfterMethod
  public void tearDown() {
    wd.quit();
  }

  @Test
  public void newTest() throws InterruptedException {

    wd.findElement(By.cssSelector(".current-course-review-start")).click();
    wd.findElement(By.cssSelector(".button > img")).click();
    wd.findElement(By.xpath("//span[contains(.,'��������� ����')]")).click();
    {
      WebElement element = wd.findElement(By.xpath("//span[contains(.,'��������� ����')]"));
      Actions builder = new Actions(wd);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = wd.findElement(By.tagName("body"));
      Actions builder = new Actions(wd);
      builder.moveToElement(element, 0, 0).perform();
    }
    wd.findElement(By.xpath("//div[2]/button/img")).click();
    wd.findElement(By.xpath("//button[3]/img")).click();

    {
      WebElement element = wd.findElement(By.xpath("//button[3]/img"));
      Actions builder = new Actions(wd);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = wd.findElement(By.tagName("body"));
      Actions builder = new Actions(wd);
      builder.moveToElement(element, 0, 0).perform();
    }
    wd.findElement(By.xpath("//button[contains(.,'������')]")).click();
    wd.findElement(By.xpath("//div[2]/button/img")).click();
    wd.findElement(By.xpath("//button[2]/img")).click();
    {
      WebElement element = wd.findElement(By.xpath("//button[2]/img"));
      Actions builder = new Actions(wd);
      builder.moveToElement(element).perform();
    }
    wd.switchTo().frame(0);
    wd.switchTo().frame(0);
    wd.findElement(By.xpath("//div[@data-acc-text ='��������� ����']")).click();
    wd.findElement(By.xpath("//div[@data-acc-text ='����������']")).click();
    wd.findElement(By.xpath("//div[@data-acc-text ='������ ����']")).click();
    Thread.sleep(5000);
    while (isElementPresent(By.xpath("//div[@data-acc-text='�����']"))) {
      Thread.sleep(1000);
      wd.findElement(By.xpath("//div[@data-acc-text='�����']")).click();
      wd.findElement(By.xpath("//div[@data-acc-text='�����']")).click();
      wd.findElement(By.xpath("//div[@data-acc-text='�����']")).click();
      Thread.sleep(3000);
      if (isElementPresent(By.xpath("//div[@data-acc-text ='���������']"))) {
        if (isElementPresent(By.xpath("//data-acc-text='����������� ����������� ������'"))) {
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='����������� ����������� ������']"))
                  .click();
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='������ � ������ ����� �� ���������� �������� ������ ��������']"))
                  .click();
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='������������, ��� �������� ��� ��������� ���� ������']"))
                  .click();
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='�������������� �������������� ����� " +
                          "(��� �������, ��� ��������� �� ��������)']"))
                  .click();
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='����� ������ ������� ������� ������� �������']"))
                  .click();
          wd.findElement
                  (By.xpath("//div[@data-acc-text ='���������']"))
                  .click();
          wd.switchTo().alert().accept();
        } else {
          if (isElementPresent(By.xpath("//data-acc-text='��� ��������� �� �������� ����������� ������'"))) {
            wd.findElement(By.xpath("//div[@data-acc-text ='������ � ������ ����� �� ����� �������������� ������']")).click();
            wd.findElement(By.xpath("//div[@data-acc-text ='��� ����������� �������']")).click();
            wd.findElement(By.xpath("//div[@data-acc-text ='���������']")).click();
            wd.switchTo().alert().accept();
          } else {
            if (isElementPresent(By.xpath("//data-acc-text='��� ���������� ����'"))) {
              wd.findElement(By.xpath("//div[@data-acc-text ='��� ���������� ����']")).click();
              wd.findElement(By.xpath("//div[@data-acc-text ='���������']")).click();
              wd.switchTo().alert().accept();
            }
          }
        }
      }
    }
//    wd.findElement(By.xpath("//div[@data-acc-text=\"�����\"]")).click();
//    Thread.sleep(1000);
//    wd.findElement(By.xpath("//div[@data-acc-text=\"�����\"]")).click();
//    wd.findElement(By.xpath("//div[@data-acc-text ='menu_;;;.png']")).click();



//   new Select(wd.findElement(By.xpath("//*[@id='slide-window']/div/div/div/div/div[4]/div[3]/div/svg/g")));
//    {
//      WebElement element = wd.findElement(By.xpath("//*[@id='slide-window']/div/div/div/div/div[4]/div[3]/div/svg/g"));
//      Actions builder = new Actions(wd);
//      builder.moveToElement(element).perform();
//    }

//    wd.switchTo();
    wd.findElement(By.xpath("//div[@data-acc-text ='������ ������������']")).click();
    wd.findElement(By.xpath("//div[@data-acc-text ='������ �������� ������ � �������� �� ������ ������ �� ������ �����']")).click();
    wd.findElement(By.xpath("//div[@data-acc-text ='�����']")).click();


    wd.findElement(By.id("uniqueDomId-1926")).click();
    wd.findElement(By.id("uniqueDomId-2703")).click();
    wd.findElement(By.id("uniqueDomId-4063")).click();
    wd.findElement(By.id("uniqueDomId-4580")).click();
    wd.findElement(By.id("uniqueDomId-4729")).click();
    wd.findElement(By.id("uniqueDomId-4869")).click();
    wd.findElement(By.id("uniqueDomId-5470")).click();
    wd.findElement(By.id("uniqueDomId-5798")).click();
    wd.switchTo().defaultContent();
    wd.switchTo().defaultContent();
    wd.findElement(By.cssSelector(".button:nth-child(1) > img")).click();
  }

  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}
