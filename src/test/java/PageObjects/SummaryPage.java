package PageObjects;

import ElementMapper.SummaryPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage extends SummaryPageElementMapper {

    public SummaryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    public void clickBtnCartProceedToCheckout(){ btnCartProceedToCheckout.click();}


}