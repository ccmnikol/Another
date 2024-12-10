package github;

import com.codeborne.selenide.logevents.SelenideLog;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;



public class HW7RegFormWithPajeObjects extends TestData {

    @Test
    void fullRegFormTest() {

        SelenideLogger.addListener("allure", new AllureSelenide()); //для того чтобы записывал шаги (наименования действий) в аллюре


        registrationPajes.openPage()
                .setFirstName(userName)
                .setLastName(lastName)
                .setEmail(email)
                .setGender()
                .setPhone(phoneNumber)
                .setBirthDate("02", "June", "1998")
                .setSubjects(subjects)
                .setHobbies()
                .uploadFile()
                .setCurrentAdress(userAdress)
                .clickSubmit()
                .verifyResultsModalAppears(userName, email, userAdress, phoneNumber);



    }
}
