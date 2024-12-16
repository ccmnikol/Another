package github;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;


public class RegFormWithAllureFunctions extends TestData {

    @Test
    void testLambdaStep() {

        SelenideLogger.addListener("allure", new AllureSelenide()); //для того чтобы записывал шаги (наименования действий) в аллюре


       step("Открываем форму регистрации", ()-> {
           registrationPajes.openPage();
       });
       step("Заполняем форму персональными данными ", ()-> {
           registrationPajes.setFirstName(userName)
                   .setLastName(lastName)
                   .setEmail(email)
                   .setGender()
                   .setPhone(phoneNumber)
                   .setBirthDate("02", "June", "1998");
       });
       step("Заполняем форму дополнительными данными", ()-> {
           registrationPajes.setSubjects(subjects)
                   .setHobbies()
                   .uploadFile()
                   .setCurrentAdress(userAdress);
       });
       step("Проверяем диалоговое окно с результатами", ()-> {
           registrationPajes.clickSubmit()
                   .verifyResultsModalAppears(userName, email, userAdress, phoneNumber);
       });

    }
}
