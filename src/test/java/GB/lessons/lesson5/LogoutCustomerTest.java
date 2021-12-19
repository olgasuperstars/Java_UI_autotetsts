package GB.lessons.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class LogoutCustomerTest extends BasicTest {

    @Test
    void logoutCustomer() {
        webDriver.get(url);
        webDriver.findElement(By.xpath("//button[contains(text(), 'Customer Login')]")).click();
        webDriver.findElement(By.xpath("//option[text()]")).click();
        webDriver.findElement(By.xpath("//option[text()='Harry Potter']")).click();
        webDriver.findElement(By.xpath("//button[text()='Login']")).click();

        webDriver.findElement(By.xpath("//button[(text()='Logout')]")).click();

        webDriver.findElement(By.xpath("//button[(text()='Home')]")).click();

        WebElement elements = webDriver.findElement(By.xpath("//button[contains(text(), 'Customer Login')]"));

        assertThat(elements.getText()).isEqualTo("Customer Login");
    }
}
