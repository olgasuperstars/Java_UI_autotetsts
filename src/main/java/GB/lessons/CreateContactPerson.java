package GB.lessons;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Calendar;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.time.LocalDate;


/**
 * Hello world!
 *
 */
public class CreateContactPerson
{

    public static void main(String[] args ) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        webDriver.get("https://crm.geekbrains.space/");
        webDriver.manage().window().setSize(new Dimension(1980, 1020));
        webDriver.findElement(By.name("_username")).sendKeys("Applanatest1");
        webDriver.findElement(By.name("_password")).sendKeys("Student2020!");
        webDriver.findElement(By.name("_submit")).click();


        Actions actions = new Actions(webDriver);

        actions.moveToElement(webDriver.findElement(By.xpath("//a[./span[text()='Контрагенты']]")))
                  .build().perform();

        webDriver.findElement(By.xpath("//a[./span[text()='Контактные лица']]")).click();

        new WebDriverWait(webDriver, 10, 500)
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='Создать контактное лицо']")))
                .click();

        webDriver.findElement(By.name("crm_contact[lastName]")).sendKeys("Иванов");
        webDriver.findElement(By.name("crm_contact[firstName]")).sendKeys("Иван");
        webDriver.findElement(By.name("crm_contact[jobTitle]")).sendKeys("Менеджер");

//        webDriver.findElement(By.xpath("//input[@placeholder='Укажите дату']")).click();
//        new Calendar(webDriver).selectDate(LocalDate.of(1990, 10, 3));

        new OrganizationDropDownList(webDriver).selectOrganization("GeekBrains1");

        webDriver.findElement(By.xpath("//button[contains(text(),'Сохранить') and not(contains(text(), 'закрыть'))]")).click();
        new WebDriverWait(webDriver, 8).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Контактное лицо сохранено')]")));

        Thread.sleep(5000);

        webDriver.quit();
    }
}
