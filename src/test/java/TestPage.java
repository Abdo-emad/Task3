import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestPage extends TestBase{

    HomePage homePage;
   @Test
    public void getCount(){
        homePage= new HomePage(driver);

       homePage.getLink().click();
       Shifting_ContentPage shifting_contentPage= new Shifting_ContentPage(driver);
       shifting_contentPage.example_click().click();
       ThirdPage thirdPage = new ThirdPage(driver);
      int count = thirdPage.getElementList().size();
       System.out.println("Count of Elements " + count);
   }
}
