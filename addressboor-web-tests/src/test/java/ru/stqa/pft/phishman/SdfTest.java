package ru.stqa.pft.phishman;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class SdfTest {
  private WebDriver wd;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @BeforeMethod
  public void setUp() {
    wd = new ChromeDriver();
    js = (JavascriptExecutor) wd;
    vars = new HashMap<String, Object>();

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
  public void sdf() {
    wd.findElement(By.xpath("//span[contains(.,\'Запустить курс\')]")).click();
    {
      WebElement element = wd.findElement(By.xpath("//span[contains(.,\'Запустить курс\')]"));
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
    wd.findElement(By.xpath("//button[contains(.,\'Начать\')]")).click();
    wd.findElement(By.xpath("//div[2]/button/img")).click();
    wd.switchTo().frame(0);
    wd.switchTo().frame(0);
    wd.findElement(By.id("uniqueDomId-1926")).click();
    wd.findElement(By.id("uniqueDomId-2703")).click();
    wd.findElement(By.id("uniqueDomId-4077")).click();
    wd.findElement(By.id("uniqueDomId-4701")).click();
    wd.findElement(By.id("uniqueDomId-5302")).click();
    wd.findElement(By.id("uniqueDomId-5629")).click();
    wd.findElement(By.id("uniqueDomId-6213")).click();
    wd.findElement(By.id("uniqueDomId-7101")).click();
    wd.findElement(By.id("uniqueDomId-7159")).click();
    wd.switchTo().defaultContent();
    wd.switchTo().defaultContent();
    wd.findElement(By.cssSelector(".button:nth-child(1) > img")).click();
  }
}
