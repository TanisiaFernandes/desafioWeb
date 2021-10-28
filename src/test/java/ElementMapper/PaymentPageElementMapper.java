package ElementMapper;

import PageObjects.PaymentPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPageElementMapper {

    @FindBy(className = "payment_module")
    public WebElement btnPaybyCheck;

    @FindBy(css= "button.btn.btn-default.button-medium")
    public WebElement btnIConfirmMyOrder;


}

