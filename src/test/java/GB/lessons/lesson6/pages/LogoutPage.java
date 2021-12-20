package GB.lessons.lesson6.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BaseView {
    public LogoutPage (WebDriver webDriver) {
        super(webDriver);
    }
    public void logout(){
        webDriver.findElement(By.xpath("//button[(text()='Logout')]")).click();
        webDriver.findElement(By.xpath("//button[(text()='Home')]")).click();
    }
}
