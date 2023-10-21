package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class MobileServicePage {

    private final SelenideElement
                    checkResult = $("h1"),
                    goArchive = $("mts-button .mts-button--color--ghost"),
                    acceptCookies = $(".mat-dialog-content button");

    public MobileServicePage checkMobileServices(String value) {
        checkResult.shouldHave(text(value));

        return this;
    }

    public MobileServicePage goToArchive() {
        acceptCookies.click();
        goArchive.click();

        return this;
    }
}