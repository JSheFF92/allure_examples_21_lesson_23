package com.qa.tests;

import com.qa.pages.CareerPage;
import com.qa.pages.ItAndDigitalPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class CareerPageTest extends BaseTest {
    ItAndDigitalPage itAndDigitalPage = new ItAndDigitalPage();
    CareerPage careerPage = new CareerPage();

    @Test
    @Tag("Smoke")
    @Tag("SmokePass")
    @Tag("Vacancies")
    @DisplayName("Страница вакансий в ИТ")
    void careerInITTest() {
        step("Open form", () -> {
            mainPage
                    .openPage()
                    .settingsRegistrationPage();
        });

        step("Open career", () ->
            mainPage
                    .openCareerPage()
        );

        step("Checking the transition to a section", () ->
            careerPage
                    .checkCareerUrl()
        );
        step("Section Vacancies", () ->
            careerPage
                    .openITAndDigitalSection()
        );

        step("Section Vacancies in IT", () -> {
            itAndDigitalPage
                    .checkItAndDigitalUrl()
                    .checkVacanciesText("Вакансии");
        });
    }
}