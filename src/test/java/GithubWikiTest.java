import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

import static com.codeborne.selenide.Selenide.*;

public class GithubWikiTest {
    @BeforeAll
    static void setUp() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://github.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void softAssertionShouldContainJunit5Example()  {
        open("/selenide/selenide");
        $("#wiki-tab").click();


    }
}