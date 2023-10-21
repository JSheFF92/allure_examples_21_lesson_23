package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class MainPage {
    private final SelenideElement
                    buttonOpenCareer = $x("//a[contains(text(), 'Карьера в МТС')]"),
                    developers = $(".ng-scrollbar-wrapper div:nth-child(6)"),
                    headerItem = $(".header__top-item_more"),
                    goToServicesAndOptions = $(".navigations__cards-wrapper a:nth-child(2)"),
                    buttonOpenNews = $(".footer__menu div:nth-child(7)"),
                    goToHeaderSearchText = $(".header-search__text"),
                    enterIntoTheSearch = $(".header-search__input"),
                    menuCatalog = $(".middle-menu__catalog-text"),
                    menuCardList = $(".in-sidebar a:nth-child(4)");

    public MainPage openPage() {
        open("/");

        return this;
    }

    public MainPage settingsRegistrationPage() {
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");

        return this;
    }

    public MainPage goToNumberPage(String value) {
        menuCatalog.click();
        menuCardList.shouldHave(text(value)).click();

        return this;
    }

    public MainPage openCareerPage() {
        buttonOpenCareer.click();

        return this;
    }

    public MainPage openHeaderSearchText() {
        goToHeaderSearchText.click();

        return this;
    }

    public MainPage search(String value) {
        enterIntoTheSearch.setValue(value).pressEnter();

        return this;
    }

    public MainPage openNewsPage() {
        buttonOpenNews.click();

        return this;
    }

    public MainPage goToSectionServicesAndOptions() {
        goToServicesAndOptions.click();

        return this;
    }

    public MainPage goToHeaderTopItem() {
        headerItem.click();

        return this;
    }

    public MainPage goToDevelopersPage() {
        developers.click();

        return this;
    }
}