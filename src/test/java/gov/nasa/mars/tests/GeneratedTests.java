package gov.nasa.mars.tests;

import com.codeborne.selenide.Condition;
import gov.nasa.mars.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {

    String base_url = "https://mars.nasa.gov";

    @Test
    @Description("Check main menu")
    @DisplayName("Check main menu on the site https://mars.nasa.gov/mars2020/")
    void generatedTest() {
        step("Open url 'https://mars.nasa.gov/mars2020/'", () ->
                open(base_url + "/mars2020/"));

        step("check menu \"Mission\"", () -> {
            $("#lnk_mission").shouldHave(Condition.text("mission"));
        });

        step("check menu \"Timeline\"", () -> {
            $("#lnk_timeline").shouldHave(Condition.text("timeline"));
        });

        step("check menu \"Spacecraft\"", () -> {
            $("#lnk_spacecraft").shouldHave(Condition.text("spacecraft"));
        });

        step("check menu \"News\"", () -> {
            $("#lnk_news").shouldHave(Condition.text("news"));
        });

        step("check menu \"Multimedia\"", () -> {
            $("#lnk_multimedia").shouldHave(Condition.text("multimedia"));
        });

        step("check menu \"Participate\"", () -> {
            $("#lnk_participate").shouldHave(Condition.text("participate"));
        });

        step("check menu \"All Mars\"", () -> {
            $("#lnk_mars").shouldHave(Condition.text("All Mars"));
        });

    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://mars.nasa.gov/mars2020/'", () ->
                open(base_url + "/mars2020/"));

        step("Page title should have text 'Mars 2020 Perseverance Rover - NASA Mars'", () -> {
            String expectedTitle = "Mars 2020 Perseverance Rover - NASA Mars";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://mars.nasa.gov/mars2020/'", () ->
                open(base_url + "/mars2020/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}