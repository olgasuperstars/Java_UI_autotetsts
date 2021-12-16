package GB.lessons.lesson3;
// тест-кейс №2:
//1. Зайти на сайт https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account
//2. Выбрать счет из выпадающего списка
//3. Кликнуть на кнопку "Deposit"
//4. ВВести сумму депозита
//4. Нажать кнопку "Deposit"
//Ожидаемый результат: Над строкой ввода суммы депозита появилась надпись: "Deposit Successful
//Amount to be Deposited :"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CurrencyDeposit {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        webDriver.findElement(By.xpath("//select")).click();
        webDriver.findElement(By.xpath("//option[text()='1004']")).click();
        webDriver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
        webDriver.findElement(By.xpath("//button[(text()='Deposit')]")).click();

        Thread.sleep(5000);

        webDriver.quit();

    }
}
