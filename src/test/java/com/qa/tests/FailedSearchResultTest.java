package com.qa.tests;

import com.qa.pages.NoSearchResultPage;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class FailedSearchResultTest extends BaseTest {

    NoSearchResultPage noSearchResultPage = new NoSearchResultPage();

    @Test
    @Tag("Smoke")
    @Tag("SmokeFailed")
    @Tag("FailedSearch")
    @DisplayName("Отсутвие результатов поиска")
    void careerInITTest() {
        step("Open form", () -> {
            mainPage
                    .openPage()
                    .settingsRegistrationPage();
        });

        step("Search", () -> {
            mainPage
                    .openHeaderSearchText()
                    .search("Hello, I'm Evgeniy and I'm looking for a job");
        });

        step("Nothing found for your request", () ->
            noSearchResultPage
                     .nothingFoundResult("По вашему запросу ничего не найдено")
        );
    }
}