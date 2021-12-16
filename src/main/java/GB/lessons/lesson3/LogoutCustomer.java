package GB.lessons.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

// тест-кейс №4:
//1. Зайти на сайт https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account
//2. Кликнуть кнопку "logout"
//3. Кликнуть кнопку "Home"
//Ожидаемый результат: перешли на главную страницу с кнопками: "Customer Login", "Bank Manager Login":
public class LogoutCustomer {

    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/account");

        webDriver.findElement(By.xpath("//button[(text()='Logout')]")).click();

        webDriver.findElement(By.xpath("//button[(text()='Home')]")).click();

        Thread.sleep(5000);

        webDriver.quit();
    }
}
