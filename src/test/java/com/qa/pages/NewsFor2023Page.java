package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class NewsFor2023Page {

    private final SelenideElement
                    checkResult = $x("//*[contains(text(), '.2023')]");

    public NewsFor2023Page checkFinalResult() {
        webdriver().shouldHave(url("https://moskva.mts.ru/personal/novosti/2023"));
        checkResult.shouldHave(visible);

        return this;
    }
}