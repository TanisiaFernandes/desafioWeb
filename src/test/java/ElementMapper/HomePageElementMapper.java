package ElementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageElementMapper {
    @FindBy(className = "login")
    public WebElement login;

    @FindBy(css= "#block_top_menu .sf-menu li:nth-child(3) a[title=T-shirts]")
    public WebElement menuTshirts;


}
