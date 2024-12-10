package pajes.components;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponents {
    public void setDate(String day, String month, String year) {
        //ChooseDateOfBirth

        $(".react-datepicker__month-select").selectOption(month);
        $(".react-datepicker__year-select").selectOption(year);
        $(".react-datepicker__day--0" + day + ":not(.react-datapicker__day--outside-month)").click();

    }
}
