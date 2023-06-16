import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ThirdPage extends PageBase{
    public ThirdPage(WebDriver driver) {
        super(driver);
    }
    public List<WebElement> getElementList() {
        List<WebElement> elementList = driver.findElements(By.tagName("a"));
        return elementList;
    }
}
