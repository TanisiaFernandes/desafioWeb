package PageObjects;

import ElementMapper.ShippingPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class ShippingPage extends ShippingPageElementMapper {

    public ShippingPage(){ PageFactory.initElements(Browser.getCurrentDriver(), this);    }

    @Step("Aceitou os termos e condições de frete")
    public void clickCheckIAgree(){
        chkIAgree.click();
    }
    public void clickBtnShippingProceedToCheckout(){btnShippingProceedToCheckout.click();}
}