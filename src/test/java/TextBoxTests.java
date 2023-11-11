import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.TextBoxPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests extends BaseTest{

    TextBoxPage textBoxPage = new TextBoxPage();

    @Test
    void fillFormTest() {
        textBoxPage.openPage()
        .setUserName("Alex")
        .setUserEmail("alex@egorov.com")
        .setCurrentAddress("Some street 1")
        .setPermanentAddress("Another street 1")
        .pressSubmit()
        .checkResult("Name:","Alex" )
        .checkResult("Email:", "alex@egorov.com")
        .checkResult("Current Address :", "Some street 1")
        .checkResult("Permananet Address :", "Another street 1");
    }
}