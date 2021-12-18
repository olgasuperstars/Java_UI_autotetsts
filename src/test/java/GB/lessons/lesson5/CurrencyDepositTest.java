package GB.lessons.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class CurrencyDepositTest extends BasicTest {

    @Test
    void currencyDepositTest() {
        webDriver.get(url);
        webDriver.findElement(By.xpath("//button[contains(text(), 'Customer Login')]")).click();
        webDriver.findElement(By.xpath("//option[text()]")).click();
        webDriver.findElement(By.xpath("//option[text()='Harry Potter']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();

        webDriver.findElement(By.xpath("//select")).click();
        webDriver.findElement(By.xpath("//option[text()='1004']")).click();
        webDriver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();
        webDriver.findElement(By.xpath("//input[@placeholder='amount']")).sendKeys("1000");
        webDriver.findElement(By.xpath("//button[(text()='Deposit')]")).click();
    }
}
