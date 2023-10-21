package com.qa.pages;

import com.codeborne.selenide.SelenideElement;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class NoSearchResultPage {

    private final SelenideElement
                    nothingFound = $("mts-search-content .mts-search__result-empty");

    public NoSearchResultPage nothingFoundResult(String value) {
        $("h1").shouldHave(text("Поиск по сайту"));
        $(nothingFound).shouldHave(exactText(value));

        return this;
    }
}