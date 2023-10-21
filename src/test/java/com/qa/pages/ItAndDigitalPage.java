package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class ItAndDigitalPage {

    private final SelenideElement
            vacanciesPageText = $("#app");

    public ItAndDigitalPage checkItAndDigitalUrl() {
        webdriver().shouldHave(url("https://job.mts.ru/jobs-it"));

        return this;
    }

    public ItAndDigitalPage checkVacanciesText(String value) {
        vacanciesPageText.shouldHave(text(value));

        return this;
    }
}