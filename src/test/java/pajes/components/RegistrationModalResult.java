package pajes.components;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationModalResult {

    public void verifyModalAppears() {

        $(".modal-dialog").should(appear);
    }

}
