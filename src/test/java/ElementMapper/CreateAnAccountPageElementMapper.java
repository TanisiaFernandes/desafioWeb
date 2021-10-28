package ElementMapper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CreateAnAccountPageElementMapper {

    @FindBy(id="customer_firstname")
    public WebElement firstName;

    @FindBy(id = "customer_lastname")
    public WebElement lastName;

    @FindBy(id = "passwd")
    public WebElement password;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "id_state")
    public WebElement state;

    @FindBy(id = "postcode")
    public WebElement PostalCode;

    @FindBy(id = "id_country")
    public WebElement country;

    @FindBy(id = "phone_mobile")
    public WebElement mobilePhone;

    @FindBy(id = "alias")
    public WebElement assign;

    @FindBy(id = "submitAccount")
    public WebElement register;

    @FindBy(id = "firstname")
    public WebElement firstName2;

    @FindBy(id = "lastname")
    public WebElement lastName2;



}