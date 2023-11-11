package pages.components;

import com.codeborne.selenide.SelenideElement;
import pages.RegistrationPage;

import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    public void setDateOfBirth(String day, String month, String year){
        $("select[class*='month-select']").selectOptionByValue(month);
        $("select[class*='year-select']").selectOptionByValue(year);
        $(".react-datepicker__month").$(byText(day)).click();
    }
}
