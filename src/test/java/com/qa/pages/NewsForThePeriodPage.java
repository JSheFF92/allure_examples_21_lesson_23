package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class NewsForThePeriodPage {

    private final SelenideElement
                    newsNamePage = $(".section-box__title"),
                    widgetYear = $("[id='mat-select-value-1']"),
                    choiceWidgetYear = $(".mat-select-old-ds__select-panel"),
                    widgetPeriod = $("[id='mat-select-2']"),
                    choiceWidgetPeriod = $(".mat-select-old-ds__select-panel"),
                    widgetCategories = $("[id='mat-select-4']"),
                    choiceWidgetCategories = $("#mat-checkbox-1");

    public NewsForThePeriodPage checkNewsUrlAndNamePage(String value) {
        webdriver().shouldHave(url("https://moskva.mts.ru/personal/novosti"));
        newsNamePage.shouldHave(text(value));

        return this;
    }

    public NewsForThePeriodPage selectNewsYear(String value) {
        widgetYear.click();
        choiceWidgetYear.$(byText(value)).click();

        return this;
    }

    public NewsForThePeriodPage selectNewsPeriod(String value) {
        widgetPeriod.click();
        choiceWidgetPeriod.$(byText(value)).click();

        return this;
    }

    public NewsForThePeriodPage selectNewsCategories(String value) {
        widgetCategories.click();
        choiceWidgetCategories.$(byText(value)).click();

        return this;
    }
}