package ru.powertech.ylukomoria;

import io.qameta.allure.Epic;
import io.qameta.allure.Story;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.support.ui.ExpectedConditions;
import ru.powertech.ylukomoria.base.BaseWebTest;
import ru.powertech.ylukomoria.page.ContentPage;
import java.util.Locale;
import static io.qameta.allure.Allure.step;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@Epic("Тестирование UI")
@Story("Тестирование панели навигации")
@DisplayName("Проверяем соответствие заголовков страниц " +
        "элементам панели навигации")
public class NavigationWebTests extends BaseWebTest {
    private ContentPage contentPage=null;

    @BeforeEach
    public void beforeEach() {
        contentPage = new ContentPage(driver);
    }

    @AfterEach
    void tearDown() {
        contentPage=null;
    }

    @DisplayName("Проверка панели навигации")
    @ParameterizedTest
    @MethodSource(value = "ru.powertech.ylukomoria.data.TestData#dataProvider")
    public void navBarTest(String nameCategory, String namePage) {
        //Кликнуть сэндвич_баттон
        contentPage.getButtonSandwich().click();
        //Выбрать категорию
        if(!nameCategory.equals("")){
            contentPage.getNavigation().getButton(nameCategory).click();
        }
        step("Проверка заголовка раздела "+
                nameCategory +"/" + namePage);
        contentPage.getNavigation().getButton(namePage).click();
        assertThat(wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getNamePage())).getText().
                toUpperCase(Locale.ROOT),
                is(equalTo(namePage.toUpperCase(Locale.ROOT))));
        step("Проверка наличия хедера на странице");
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getHeader()));
        step("Проверка наличия футтера на странице");
        wait15second.until(ExpectedConditions.visibilityOf(
                contentPage.getFooter()));
    }

    }

