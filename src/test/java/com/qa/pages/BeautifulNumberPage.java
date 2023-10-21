package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;

public class BeautifulNumberPage {

    private final SelenideElement
                    sliderMaxPrice = $("[role='slider'].ngx-slider-pointer-max"),
                    sliderMinPrice = $("[role='slider'].ngx-slider-pointer-min"),
                    choicePriceMax = $("span:nth-child(4) ngx-slider-tooltip-wrapper"),
                    choicePriceMin = $("span:nth-child(3) ngx-slider-tooltip-wrapper"),
                    searchNeedNumber = $("mts-search-form form button"),
                    checkFilterPrice = $x("//*[text()[contains(.,'1 000')]]");

    public BeautifulNumberPage checkChoiceUrl() {
        webdriver().shouldHave(url("https://moskva.mts.ru/personal/vybrat-nomer"));

        return this;
    }

    public BeautifulNumberPage selectSliderPriceNumber() {
        actions().clickAndHold(sliderMaxPrice).moveToElement(choicePriceMax).release().build().perform();
        actions().clickAndHold(sliderMinPrice).moveToElement(choicePriceMin).release().build().perform();

        return this;
    }

    public BeautifulNumberPage searchNumberWithNeedPrice(String value) {
        searchNeedNumber.click();
        checkFilterPrice.shouldHave(text(value));

        return this;
    }
}