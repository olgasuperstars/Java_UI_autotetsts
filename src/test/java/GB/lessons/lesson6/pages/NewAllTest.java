package GB.lessons.lesson6.pages;

import GB.lessons.lesson5.BasicTest;
import org.junit.jupiter.api.Test;

public class NewAllTest extends BasicTest {
    @Test
    void LoginCustomerTest() {
        new LoginPage(webDriver).login();
    }
    @Test
    void LogoutCustomerTest(){
        new LoginPage(webDriver).login()
                .logout();
    }
    @Test
    void DepositCustomerTest(){
        new LoginPage(webDriver).login()
                .deposit();
    }
    @Test
    void WithdrawCustomerTest(){
        new LoginPage(webDriver).login()
                .withdraw();
    }
}
