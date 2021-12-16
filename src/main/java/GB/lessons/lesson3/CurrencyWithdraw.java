package GB.lessons.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

// тест-кейс №3:
//1. Зайти на сайт https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account
//2. Выбрать счет из выпадающего списка
//3. Кликнуть на кнопку "Withdraw"
//4. ВВести сумму снятия наличных
//4. Нажать кнопку "Withdraw"
//Ожидаемый результат: Над строкой ввода суммы депозита появилась надпись: "Transaction Successful
//Amount to be Withdrawn :"
public class CurrencyWithdraw {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");
        webDriver.findElement(By.xpath("//select")).click();
        webDriver.findElement(By.xpath("//option[text()='1004']")).click();
        webDriver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("2000");
        webDriver.findElement(By.xpath("//button[(text()='Withdraw')]")).click();

        Thread.sleep(5000);

        webDriver.quit();
    }
}
