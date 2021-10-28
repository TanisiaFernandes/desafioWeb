package PageObjects;

import ElementMapper.CreateAnAccountPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class CreateAnAccountPage extends CreateAnAccountPageElementMapper {

    private Random random;
    public CreateAnAccountPage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
        random = new Random();
    }
    @Step("Preenche campos obrigatórios para cadastro de novos usuários")
    public void fillFirstName() {
        firstName.sendKeys("Tanisia");
    }
    public void fillLastName() {
        lastName.sendKeys("Fernandes");
    }
    public void fillPassword() {
        password.sendKeys("12345");
    }
    public void fillAddress() {
        address.sendKeys("Rua hum, 000");
    }
    public void fillCity() {
        city.sendKeys("Parobé");
    }
    public void fillState() {
        state.sendKeys("Arizona");
    }
    public void fillPostalCode() {
        PostalCode.sendKeys("00000");
    }
    public void fillCountry() {
        country.sendKeys("");
    }
    public void fillMobilePhone() {
        mobilePhone.sendKeys("123456789");
    }
    public void fillAssign() {
        assign.sendKeys(" ");
    }
    public void clickBtnRegister() {register.click();}
    public String getFirstName() {
        return firstName.getText();
    }
    public String getFirstNameAddress() {
        return firstName2.getText();
    }
    public String getLastName() {
        return lastName.getText();
    }
    public String getLastNameAddress() {
        return lastName2.getText();
    }

}
