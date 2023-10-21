package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ApiMtsPage {

    private final SelenideElement
                    servicesList = $(".dqyHYH"),
                    listAPI = $(".eqUlAG");

    public ApiMtsPage checkDevelopersUrl() {
        webdriver().shouldHave(url("https://developers.mts.ru/"));

        return this;
    }

    public ApiMtsPage searchServicesList(String value) {
        servicesList.shouldHave(text(value));

        return this;
    }

    public ApiMtsPage checkAPIList() {
        String[] API = new String[]{"Мобильный ID API", "Дизайн-система МТС",
                "МТС Касса API", "Agents API", "Agents API (тестовый стенд)"};
        for (int i = 0; i < API.length; i++) {
            listAPI.shouldHave(text(API[i]));
        }

        return this;
    }
}