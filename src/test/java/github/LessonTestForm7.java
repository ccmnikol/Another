package github;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class LessonTestForm7 {

//@BeforeAll
//static void beforeAll(){
//    Configuration.browserSize = "1920x1080";
//    Configuration.baseUrl = "https://demoqa.com";}

    @Test
void fillFormTest(){
// Автоматическое управление WebDriver
        WebDriverManager.chromedriver().setup();

        Configuration.pageLoadTimeout = 60000;
        Configuration.pageLoadStrategy = "eager";

    Selenide.open("https://demoqa.com/text-box");
$(".text-center").shouldHave(text("Text Box"));

$("#userName").setValue("Nikola");
$("#userEmail").setValue("y45erer@mail.ru");
$("#currentAddress").setValue("poocc");
$("#permanentAddress").setValue("poobbd112");

//    //сабмит
$(".btn.btn-primary").click();
sleep(5000);

//    // проверка
$("#output").shouldBe(visible);
$("#output").$("#name").shouldHave(text("Nikola"));
$("#output").$("#email").shouldHave(text("y45erer"));
$("#output").$("#currentAddress").shouldHave(text("poocc"));
$("#output").$("#permanentAddress").shouldHave(text("poobbd112"));

}
}
