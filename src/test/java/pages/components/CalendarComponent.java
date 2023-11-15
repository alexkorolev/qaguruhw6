package pages.components;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDateOfBirth(String day, String month, String year){
        $("select[class*='month-select']").selectOption(month);
        $("select[class*='year-select']").selectOption(year);
        $(".react-datepicker__month").$(byText(day)).click();
    }
}
