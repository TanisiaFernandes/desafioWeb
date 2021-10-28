package PageObjects;


import ElementMapper.HomePageElementMapper;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;
import Utils.Browser;

public class HomePage extends HomePageElementMapper {
    public HomePage() {
        PageFactory.initElements(Browser.getCurrentDriver(), this);
    }

    @Step("Clicou em Sign In e direcionou para a página de login")
    public void clickBtnLogin(){
        login.click();
    }
    public void clickCategoryTShirts(){
        menuTshirts.click();
    }


}

