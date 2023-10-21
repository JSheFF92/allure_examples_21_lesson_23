package com.qa.tests;

import com.qa.pages.ApiMtsPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class VerificationApiMtsTest extends BaseTest {

    ApiMtsPage verificationAPIMTSPage = new ApiMtsPage();

    @Test
    @Tag("Smoke")
    @Tag("SmokePass")
    @Tag("ApiMts")
    @DisplayName("Проверка списка API MTS")
    void searchAPIMTSTest() {
        step("Open main page", () -> {
            open("https://moskva.mts.ru");
            mainPage
                    .openPage()
                    .settingsRegistrationPage();
        });

        step("Developers go to services", () -> {
            mainPage
                    .goToHeaderTopItem()
                    .goToDevelopersPage();
        });

        step("Check Developers page and services", () -> {
            verificationAPIMTSPage
                    .checkDevelopersUrl()
                    .searchServicesList("СПИСОК СЕРВИСОВ");
        });

        step("Services APIs are present on the page", () ->
            verificationAPIMTSPage
                    .checkAPIList()
        );
    }
}