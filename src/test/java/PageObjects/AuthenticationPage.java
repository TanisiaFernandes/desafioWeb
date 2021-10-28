package PageObjects;

import ElementMapper.AuthenticationPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class AuthenticationPage extends AuthenticationPageElementMapper {

    private final Random random;

    public AuthenticationPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
        random = new Random();
    }

    @Step("Preencher o email")
    public void fillEmail(){
        email_create.sendKeys("tanisia"+ random.nextInt()+"@gmail.com");
    };

    @Step("Clicar no botão creat an account")
    public void clickSubmitCreate(){
        SubmitCreate.click();
    }
}
