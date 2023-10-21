package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MobileServiceArchivePage {

    private final SelenideElement
                    archiveList = $(".alphabetical-list");

    public MobileServiceArchivePage goToArchiveList(String value) {
        archiveList.shouldHave(text(value)).click();

        return this;
    }
}