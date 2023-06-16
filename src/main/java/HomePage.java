import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public WebElement getLink(){

        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        return link;
    }
}
