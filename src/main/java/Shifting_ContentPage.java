import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shifting_ContentPage extends PageBase{
    public Shifting_ContentPage(WebDriver driver) {
        super(driver);
    }


    public WebElement example_click(){
        WebElement example= driver.findElement(By.linkText("Example 1: Menu Element"));
        return example;
    }
}
