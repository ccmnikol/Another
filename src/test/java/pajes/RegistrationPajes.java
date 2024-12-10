package pajes;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import io.github.bonigarcia.wdm.WebDriverManager;
import pajes.components.CalendarComponents;
import pajes.components.RegistrationModalResult;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPajes {
    CalendarComponents calendarComponents = new CalendarComponents();
    RegistrationModalResult registrationModalResult = new RegistrationModalResult();

    private SelenideElement
            lastNameInput = $("#lastName"),
            firstNameInput = $("#firstName"),
            emailInput = $("input#userEmail.form-control");

    public RegistrationPajes openPage() {
        WebDriverManager.chromedriver().setup();
        Configuration.pageLoadTimeout = 60000;
        Configuration.pageLoadStrategy = "eager";
        boolean holdBrowserOpen = Configuration.holdBrowserOpen;
        open("https://demoqa.com/automation-practice-form");
        // Удаление баннеров или других мешающих элементов
        executeJavaScript("$('#fixedban').remove();");
        executeJavaScript("$('footer').remove();");

        return this;
    }

    public RegistrationPajes setFirstName(String value) {
        firstNameInput.setValue(value);

        return this;
    }

    public RegistrationPajes setLastName(String value) {
        lastNameInput.setValue(value);

        return this;
    }

    public RegistrationPajes clearLastName() {
        lastNameInput.clear();

        return this;
    }

    public RegistrationPajes setEmail(String value) {
        emailInput.setValue(value); // todo move to Selenide elements - already done

        return this;
    }

    public RegistrationPajes setGender() {
        $("label[for='gender-radio-1']").click(); // best

        return this;
    }

    public RegistrationPajes setPhone(String value) {
        $("#userNumber").setValue(value);

        return this;
    }

    public RegistrationPajes setBirthDate (String day, String month, String year) {
        $("#dateOfBirthInput").click();
        calendarComponents.setDate(day, month, year);
        return this;
    }

     public RegistrationPajes setSubjects (String subjects) {
         $("#subjectsInput").setValue(subjects).pressEnter();

        return this;
    }

     public RegistrationPajes setHobbies () {
         $("label[for='hobbies-checkbox-2']").click();

        return this;
    }

     public RegistrationPajes uploadFile () {
         $("#uploadPicture").uploadFromClasspath("img/1.png");

        return this;
    }

     public RegistrationPajes setCurrentAdress (String userAdress) {
         $("#currentAddress").setValue(userAdress);

        return this;
    }

     public RegistrationPajes clickSubmit () {
         $("#submit").click();

        return this;
    }

    public RegistrationPajes verifyResultsModalAppears (String userName, String email, String userAdress, String phoneNumber) {
       registrationModalResult.verifyModalAppears ();
        $(".table-responsive").shouldHave(text(userName), text(email), text(userAdress), text(phoneNumber));
        return this;
    }

}
