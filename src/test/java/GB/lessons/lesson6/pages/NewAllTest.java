package GB.lessons.lesson6.pages;

import GB.lessons.lesson5.BasicTest;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NewAllTest extends BasicTest {
    @Test
    @DisplayName("Логин Гарри Поттера")
    @Description("В этом тесте Поттер зашел в банк, просто зашел узнать, что банк работает")
    @Severity(SeverityLevel.BLOCKER)
    void LoginCustomerTest() {
        new LoginPage(webDriver).login();
    }
    @Test
    @DisplayName("Гарри Поттер покинул банк")
    @Description("В этом тесте Поттер зашел в банк, забыл зачем зашел и вышел")
    @Severity(SeverityLevel.NORMAL)
    void LogoutCustomerTest(){
        new LoginPage(webDriver).login()
                .logout();
    }
    @Test
    @DisplayName("Гарри Поттер положил деньги на депозит")
    @Description("В этом тесте Поттер логинится в банке и потом кладет деньги на счет")
    @Severity(SeverityLevel.BLOCKER)
    void DepositCustomerTest(){
        new LoginPage(webDriver).login()
                .deposit();
    }
    @Test
    @DisplayName("Гарри Поттер взял деньжат чутка")
    @Description("В этом тесте Поттер логинится в банке и потом забирает честь денег со счета")
    @Severity(SeverityLevel.BLOCKER)
    void WithdrawCustomerTest(){
        new LoginPage(webDriver).login()
                .withdraw();
    }
}
