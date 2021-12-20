package GB.lessons.lesson6.pages;

import GB.lessons.lesson5.BasicTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BaseView{

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public HarryPotterPage login (){

        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        webDriver.findElement(By.xpath("//button[contains(text(), 'Customer Login')]")).click();
        webDriver.findElement(By.xpath("//option[text()]")).click();
        webDriver.findElement(By.xpath("//option[text()='Harry Potter']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();
        return  new HarryPotterPage(webDriver);
    }

}
