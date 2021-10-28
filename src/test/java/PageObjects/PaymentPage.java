package PageObjects;

import ElementMapper.PaymentPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class PaymentPage extends PaymentPageElementMapper {

    public PaymentPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicou em PaybyCheck e finalizou a compra")
    public void clickBtnPaybyCheck(){
        btnPaybyCheck.click();
    }
    public void clickBtnIConfirmMyOrder(){ btnIConfirmMyOrder.click(); }
}
