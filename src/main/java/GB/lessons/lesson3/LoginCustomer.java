package GB.lessons.lesson3;
// тест-кейс №1:
//1. Зайти на сайт https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login
//2. Кликнуть кнопку "Customer Login"
//3. В выпадающем списке выбрать имя пользователя (Harry Potter)
//4. Нажать кнопку "Login"
//Ожидаемый результат: перешли на страницу с заголовком: "Welcome Harry Potter !!":

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class LoginCustomer {
    public static void main(String[] args) throws InterruptedException {
        WebDriver webDriver = WebDriverManager.chromedriver().create();

        webDriver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        webDriver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        webDriver.findElement(By.xpath("//button[contains(text(), 'Customer Login')]")).click();
        webDriver.findElement(By.xpath("//option[text()]")).click();
        webDriver.findElement(By.xpath("//option[text()='Harry Potter']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();


        Thread.sleep(5000);

        webDriver.quit();

    }


}
