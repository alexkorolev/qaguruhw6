import org.junit.jupiter.api.Test;
import pages.RegistrationPage;
import pages.components.ResultWindow;

public class RegistrationForm  extends BaseTest{

    RegistrationPage registrationPage = new RegistrationPage();
    ResultWindow resultWindow = new ResultWindow();

    @Test
    void fillFullPracticeForm() {
        registrationPage
                .openPage()
                .removeBanners()
                .setFirstName("FirstName")
                .setLastName("LastName")
                .setUserEmail("test@test.com")
                .setGender()
                .setSubject("English")
                .setUserNumber("9990002233")
                .setCalendarDate("30", "10", "1985")
                .setHobbies("Reading")
                .uploadPicture("my.png")
                .setAddress("Lenina street 100 , flat 101")
                .setState("NCR")
                .setCity("Noida")
                .pressSubmit();

        resultWindow.checkModalWindowDisplayed()
                .checkTableText("FirstName LastName")
                .checkTableText("test@test.com")
                .checkTableText("Male")
                .checkTableText("9990002233")
                .checkTableText("30 October,1985")
                .checkTableText("English")
                .checkTableText("my.png")
                .checkTableText("Lenina street 100 , flat 101")
                .checkTableText("NCR Noida");
    }

    @Test
    void fillMinFieldsOfPracticeForm() {
        registrationPage
                .openPage()
                .removeBanners()
                .setFirstName("FirstName")
                .setLastName("LastName")
                .setUserEmail("test@test.com")
                .setGender()
                .setUserNumber("9990002233")
                .pressSubmit();

        resultWindow.checkModalWindowDisplayed()
                .checkTableText("FirstName LastName")
                .checkTableText("test@test.com")
                .checkTableText("Male")
                .checkTableText("9990002233");
    }

    @Test
    void notFillMinFieldsOfForm() {
        registrationPage
                .openPage()
                .removeBanners()
                .setFirstName("FirstName")
                .setLastName("LastName")
                .setUserEmail("test@test.com")
                .setGender()
                .pressSubmit();

       resultWindow.checkModalWindowNotDisplayed();
//               checkTableText("FirstName LastName")
//                .checkTableText("test@test.com")
//                .checkTableText("Male")
//                .checkTableText("9990002233");
    }
}
