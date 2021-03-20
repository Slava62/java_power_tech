package ru.powertech.ylukomoria.page;


import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ru.powertech.ylukomoria.block.Navigation;

@Getter
public class ContentPage extends PageFactory {

    @FindBy(css = "header[class=\"header mm-slideout\"]")
    private WebElement header;

    @FindBy(css = "footer div[class=\"container margin_60_35\"]")
    private WebElement footer;

    @FindBy(css = "h1[class=\"fadeInUp animated\"]")
    private WebElement namePage;

    //Сендвич баттон
    @FindBy(xpath = "//*[@id=\"hamburger\"]/div/div")
    private WebElement buttonSandwich;

    private Navigation navigation;

    public ContentPage(WebDriver driver) {
        initElements(driver, this);
        navigation = new Navigation(driver);
    }

}
