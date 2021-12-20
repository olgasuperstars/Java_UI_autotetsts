package GB.lessons.lesson6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage extends BaseView {
    public DepositPage (WebDriver webDriver) {
        super(webDriver);
    }
    public void deposit() {
        webDriver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
        webDriver.findElement(By.xpath("//button[(text()='Deposit')]")).click();
    }
}
