package ru.powertech.ylukomoria.block;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Navigation extends PageFactory {



    public Navigation(WebDriver driver) {
        initElements(driver, this);
    }
    //Категория Инфраструктура
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[3]/a")
    private WebElement buttonInfrastructure;
    //Подкатегория Пляж
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[1]/a")
    private WebElement buttonBeach;
    //Подкатегория Беседки
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[2]/a")
    private WebElement buttonGazebos;
    //Подкатегория Пешие и велодорожки
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[3]/a")
    private WebElement buttonHikingAndCyclingTrails;
    //Подкатегория Летние веранды
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[4]/a")
    private WebElement buttonSummerVerandas;
    //Подкатегория Детские площадки
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[5]/a")
    private WebElement buttonChildrensPlaygrounds;
    //Подкатегория Банкетный зал
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[6]/a")
    private WebElement buttonBanquetHall;
    //Подкатегория Искусственный водоем
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[7]/a")
    private WebElement buttonArtificialPond;
    //Подкатегория Кинотеатр
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[8]/a")
    private WebElement buttonCinema;
    //Подкатегория Танцевальная площадка
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[9]/a")
    private WebElement buttonDanceFloor;
    //Подкатегория Зона барбекю
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[10]/a")
    private WebElement buttonBarbecueArea;
    //Подкатегория Спортивные площадки
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[11]/a")
    private WebElement buttonSportsGrounds;
    //Подкатегория Парковка
    @FindBy(xpath = "//*[@id=\"mm-2\"]/ul/li[12]/a")
    private WebElement buttonParkingLot;

    //Категория О нас
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[2]/span/a")
    private WebElement buttonAbout;

    //Категория контакты
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[8]/span/a")
    private WebElement buttonContacts;

    //Категория Бронирование
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[9]/span/a")
    private WebElement buttonBooking;

    //Категория Корпоративным клиентам
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[7]/a")
    private WebElement buttonForCorporateClients;
    //Подкатегория Проведение выездных мероприятий
    @FindBy(xpath = "//*[@id=\"mm-6\"]/ul/li/a")
    private WebElement buttonConductingEvents;

    //Категория Кафе
    @FindBy(xpath = "//*[@id=\"mm-1\"]/ul/li[5]/a")
    private WebElement buttonCafe;
    //Подкатегория Меню и цены
    @FindBy(xpath = "//*[@id=\"mm-4\"]/ul/li/a")
    private WebElement buttonMenuAndCost;

    public WebElement getButton(String nameButton) {

        switch (nameButton) {

            case "Инфраструктура":{
                return buttonInfrastructure;
            }
            case "Пляж":{
                return buttonBeach;
            }
            case "Беседки":{
                return buttonGazebos;
            }
            case "Пешие и велодорожки":{
                return buttonHikingAndCyclingTrails;
            }
            case "Летние веранды":{
                return buttonSummerVerandas;
            }
            case "Детские площадки":{
                return buttonChildrensPlaygrounds;
            }
            case "Банкетный зал":{
                return buttonBanquetHall;
            }
            case "Искусственный водоем":{
                return buttonArtificialPond;
            }
            case "Кинотеатр":{
                return buttonCinema;
            }
            case "Танцевальная площадка":{
                return buttonDanceFloor;
            }
            case "Зона барбекю":{
                return buttonBarbecueArea;
            }
            case "Спортивные площадки":{
                return buttonSportsGrounds;
            }
            case "Парковка":{
                return buttonParkingLot;
            }
            case "Кафе":{
                return buttonCafe;
            }
            case "Меню и цены": {
                return buttonMenuAndCost;
            }
            case "Контакты": {
                return buttonContacts;
            }
            case "О нас": {
                return buttonAbout;
            }
            case "Бронирование": {
                return buttonBooking;
            }
            case "Корпоративным клиентам":{
                return buttonForCorporateClients;
            }
            case "Проведение выездных мероприятий": {
                return buttonConductingEvents;
            }
        }
        throw new RuntimeException("кнопки: " + nameButton + " нет на странице!");

    }
}