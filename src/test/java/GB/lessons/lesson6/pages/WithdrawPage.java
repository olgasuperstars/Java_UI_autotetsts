package GB.lessons.lesson6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithdrawPage extends BaseView {
    public WithdrawPage (WebDriver webDriver) {
        super(webDriver);
    }
    public void withdraw(){
        webDriver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("2000");
        webDriver.findElement(By.xpath("//button[(text()='Withdraw')]")).click();
    }
}
