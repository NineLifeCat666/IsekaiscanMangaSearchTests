import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud:4444/wd/hub/";
    }

    public void openIsekaiSkan() {
        step("Открываем главную страницу isekaiskan.com", () -> {
            open("https://isekaiscan.com/");
        });

    }
}