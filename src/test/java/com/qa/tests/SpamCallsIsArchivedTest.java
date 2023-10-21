package com.qa.tests;

import com.qa.pages.MobileServiceArchivePage;
import com.qa.pages.MobileServicePage;
import com.qa.pages.SpamCallsArchivePage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class SpamCallsIsArchivedTest extends BaseTest {

    MobileServiceArchivePage mobileServiceArchivePage = new MobileServiceArchivePage();
    MobileServicePage mobileServicePage = new MobileServicePage();
    SpamCallsArchivePage spamCallsIsArchivedPage = new SpamCallsArchivePage();

    @Test
    @Tag("Smoke")
    @Tag("SmokePass")
    @Tag("SpamCalls")
    @DisplayName("Архивная услуга 'Блокирование спам звонков'")
    void archiveSpamCallsTest() {
        step("Open main page", () -> {
            open("https://moskva.mts.ru");
            mainPage
                    .openPage()
                    .settingsRegistrationPage();
        });

        step("Go to section 'Services and options'", () ->
            mainPage
                    .goToSectionServicesAndOptions()
        );

        step("Go to archive", () -> {
            mobileServicePage
                    .checkMobileServices("Услуги мобильной связи")
                    .goToArchive();
        });

//        step("Choice mobile services", () ->
//            mobileServiceArchivePage
//                    .goToArchiveList("Звонки")
//        );

        step("Choice archive block calls", () -> {
        spamCallsIsArchivedPage
                .goChoiceArchiveService("Блокировка спам-звонков")
                .checkRightService("Блокировка спам-звонков");
    });
    }
}