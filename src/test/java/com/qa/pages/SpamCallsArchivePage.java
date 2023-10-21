package com.qa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class SpamCallsArchivePage {

    private final SelenideElement
                    checkResult = $("h1"),
                    archiveServices = $(".alphabetical-list__group");
    //archive__group

    public SpamCallsArchivePage goChoiceArchiveService(String value) {
//        archiveServices.shouldHave(text(value)).click();
        archiveServices.$(byText(value)).click();

        return this;
    }

    public SpamCallsArchivePage checkRightService(String value) {
        checkResult.shouldHave(text(value));

        return this;
    }
}