package GB.lessons.lesson6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HarryPotterPage extends BaseView {
    public HarryPotterPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void choice() {
        webDriver.findElement(By.xpath("//select")).click();
        webDriver.findElement(By.xpath("//option[text()='1004']")).click();
    }

    public void logout() {
        webDriver.findElement(By.xpath("//button[(text()='Logout')]")).click();
        webDriver.findElement(By.xpath("//button[(text()='Home')]")).click();
    }

    public void withdraw(){
        webDriver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("2000");
        webDriver.findElement(By.xpath("//button[(text()='Withdraw')]")).click();
    }

    public void deposit() {
        webDriver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
        webDriver.findElement(By.xpath("//button[(text()='Deposit')]")).click();
    }

}
