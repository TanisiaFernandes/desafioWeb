package PageObjects;

import ElementMapper.AddressesPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class AddressesPage extends AddressesPageElementMapper {

    public AddressesPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }
    @Step("Clicou no botão adicionar no carrinho na página de endereço")
    public void clickBtnAddressesProceedToCheckout(){
        btnAddressesProceedToCheckout.click();
    }
}
