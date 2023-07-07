package Tests;

import Pages.GoogleMainPage;
import io.qameta.allure.Description;
import io.qameta.allure.TmsLink;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;

public class OpenMainPageTest extends BaseTest{

    GoogleMainPage googleMainPage = new GoogleMainPage();


    @Test
    @TmsLink("1232")
    @Description("Test first google page")
    public void openMainPageTest(){
        open("https://www.google.com.ua/");
        googleMainPage.checkIfLogoIsVisible();
    }
}
