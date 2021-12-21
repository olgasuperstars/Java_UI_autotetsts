package GB.lessons.lesson5;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public class BasicTest {
    protected WebDriver webDriver;
    protected WebDriverWait webDriverWait;
    String url = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";

    @BeforeEach
    void setUp() {
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        webDriverWait = new WebDriverWait(webDriver, 6);
    }

    @AfterEach
    void tearDown() {

//        Iterator<LogEntry> iterator = webDriver.manage().logs().get(LogType.BROWSER).iterator();
//        LogEntries logEntries = (LogEntries) iterator;
//
//        while (iterator.hasNext()){
//            Allure.addAttachment("console log", iterator.next().getMessage());
//        }
        webDriver.quit();
    }
}
