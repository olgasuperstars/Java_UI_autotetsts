// https://gbcdn.mrgcdn.ru/uploads/record/164103/attachment/b1e67a321afaab78856d8ccb6453812a.mp4 видео с урока

package GB.lessons.lesson6.pages.listener;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class ActionEventListener extends AbstractWebDriverEventListener {
    @Override
    public void beforeClickOn(WebElement element, WebDriver driver) {
        super.beforeClickOn(element, driver);
    }

    @Override
    public void afterClickOn(WebElement element, WebDriver driver) {
        super.afterClickOn(element, driver);
    }

    @Override
    public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        super.beforeChangeValueOf(element, driver, keysToSend);
    }

    @Override
    public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
        super.afterChangeValueOf(element, driver, keysToSend);
    }
}
