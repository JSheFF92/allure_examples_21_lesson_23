package com.qa.tests;

import com.qa.pages.BeautifulNumberPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class BeautifulNumberTest extends BaseTest {

    BeautifulNumberPage beautifulNumberPage = new BeautifulNumberPage();

    @Test
    @Tag("Smoke")
    @Tag("SmokePass")
    @Tag("ChoiceNumber")
    @DisplayName("Выбор красивого номера со стоимостью от 1000 до 5000 рублей")
    void choiceBeautifulNumberTest() {
        step("Open main page", () -> {
            mainPage
                    .openPage()
                    .settingsRegistrationPage();
        });

        step("Go to choice number page", () ->
                mainPage
                        .goToNumberPage("Выбрать красивый номер")
        );

        step("Select number amount", () -> {
            beautifulNumberPage
                    .checkChoiceUrl()
                    .selectSliderPriceNumber();
        });

        step("Checking the selection result", () ->
                beautifulNumberPage
                        .searchNumberWithNeedPrice("1 000")
        );
    }
}