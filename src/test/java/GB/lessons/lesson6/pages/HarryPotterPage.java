package GB.lessons.lesson6.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HarryPotterPage extends BaseView {
    public HarryPotterPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Выбрать счет")
    public void choice() {
        webDriver.findElement(By.xpath("//select")).click();
        webDriver.findElement(By.xpath("//option[text()='1004']")).click();
    }

    @Step("Разлогиниться")
    public void logout() {
        webDriver.findElement(By.xpath("//button[(text()='Logout')]")).click();
        webDriver.findElement(By.xpath("//button[(text()='Home')]")).click();
    }

    @Step("Снять деньги со счета")
    public void withdraw() {
        webDriver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("2000");
        webDriver.findElement(By.xpath("//button[(text()='Withdraw')]")).click();
    }

    @Step("Положить деньги на счет")
    public void deposit() {
        webDriver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
        webDriver.findElement(By.xpath("//button[(text()='Deposit')]")).click();
    }

}
