package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GoogleMainPage extends BasePage{

    SelenideElement googleLogo = $("[alt='Googleeed']");

    public GoogleMainPage checkIfLogoIsVisible(){
        googleLogo.shouldBe(visible);
        return this;
    }
}
