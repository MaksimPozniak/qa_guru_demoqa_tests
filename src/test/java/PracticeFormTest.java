import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class PracticeFormTest {

    @BeforeAll
    static void setUp() {
        io.github.bonigarcia.wdm.WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void practiceFormTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("Иван");
        $("#lastName").setValue("Петров");
        $("#userEmail").setValue("ivan@test.com");
        $("#userNumber").setValue("1234567890");
        $("#gender-radio-1").parent().click();
        $("#dateOfBirthInput").setValue("28 Feb 1990").pressEnter();
        $("#subjectsInput").setValue("Math").pressEnter();
        $("#hobbies-checkbox-1").parent().click();
        $("#uploadPicture").uploadFromClasspath("img/photo.jpg");
        $("#currentAddress").setValue("ул. Тестовая, д. 1");
        $("#state").click();
        $("#state input").setValue("NCR").pressEnter();
        $("#city").click();
        $("#city input").pressEnter();
        $("#submit").click();
    }
}