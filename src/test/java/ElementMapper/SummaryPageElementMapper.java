package ElementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SummaryPageElementMapper {

    @FindBy(css = ".cart_navigation a[title='Proceed to checkout']")
    public WebElement btnCartProceedToCheckout;

}