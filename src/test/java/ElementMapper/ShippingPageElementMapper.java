package ElementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShippingPageElementMapper {

    @FindBy(id = "cgv")
    public WebElement chkIAgree;

    @FindBy(name = "processCarrier")
    public WebElement btnShippingProceedToCheckout;


}
