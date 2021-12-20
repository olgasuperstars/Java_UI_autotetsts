package GB.lessons.lesson6.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
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


}
