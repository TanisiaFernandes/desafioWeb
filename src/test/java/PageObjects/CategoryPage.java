package PageObjects;

import ElementMapper.CategoryPageElementMapper;
import Utils.Browser;
import io.qameta.allure.Step;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends CategoryPageElementMapper {

    public CategoryPage(){
        PageFactory.initElements(Browser.getCurrentDriver(),this);
    }

    @Step("Adiciona o produto da página Categoria para a página de produto")
    public void clickProductAddToProductPage(){
        BasePage.mouseOver(productName);
        buttonMoreAddToProductPage.click();
    }


}
