package Tests;

import PageObjects.*;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import tests.BaseTests;

import static org.junit.Assert.assertEquals;

@Feature("Testes site de ecommerce")
public class SetupTest extends BaseTests {

    @Test
    @Story("Criar nova Conta de usuário")

    public void testCreateAnAccount(){
        //iniciar as páginas
        HomePage home = new HomePage();
        AuthenticationPage authenticationPage = new AuthenticationPage();
        CreateAnAccountPage createAnAccountPage = new CreateAnAccountPage();

        home.clickBtnLogin();
        System.out.println("Clicou em SigIn");
        authenticationPage.fillEmail();
        System.out.println("Preencheu campo email");
        authenticationPage.clickSubmitCreate();
        System.out.println("Clicou no btn Create an account");

        createAnAccountPage.fillFirstName();
        System.out.println("Preencheu FirstName");
        assertEquals(createAnAccountPage.getFirstName(), createAnAccountPage.getFirstNameAddress());
        System.out.println("Conferiu FirstName do cliente.");
        createAnAccountPage.fillLastName();
        System.out.println("Preencheu LastName");
        assertEquals(createAnAccountPage.getLastName(), createAnAccountPage.getLastNameAddress());
        System.out.println("Conferiu LastName.");
        createAnAccountPage.fillPassword();
        System.out.println("Preencheu Password");
        createAnAccountPage.fillAddress();
        System.out.println("Preencheu Address");
        createAnAccountPage.fillCity();
        System.out.println("Preencheu City");
        createAnAccountPage.fillState();
        System.out.println("Preencheu State");
        createAnAccountPage.fillPostalCode();
        System.out.println("Preencheu PostalCode");
        createAnAccountPage.fillCountry();
        System.out.println("Preencheu Country");
        createAnAccountPage.fillMobilePhone();
        System.out.println("Preencheu Mobile Phone");
        createAnAccountPage.fillAssign();
        System.out.println("Preencheu Assign");
        createAnAccountPage.clickBtnRegister();
        System.out.println("Clicou no botão Register");

    }

    @Test
    @Story("Validar fluxo de compra")
    public void testValidaCompra(){

        //Iniciar páginas
        HomePage home = new HomePage();
        LoginPage login = new LoginPage();
        CategoryPage category = new CategoryPage();
        ProductPage pdp = new ProductPage();
        SummaryPage summary = new SummaryPage();
        AddressesPage addressesPage = new AddressesPage();
        ShippingPage shippingPage = new ShippingPage();
        PaymentPage paymentPage = new PaymentPage();

        //fazer login no site
        home.clickBtnLogin();
        System.out.println("Clicou em SigIn");
        login.fillEmail();
        System.out.println("Preencheu email");
        login.fillPasswd();
        System.out.println("Preencheu a senha");
        login.ClickBtnSubmitLogin();
        System.out.println("Clicou no btn SigIn");

        //clicar na categoria TSHIRTS
        home.clickCategoryTShirts();
        System.out.println("Clicou na Categoria T-SHIRTS");

        //clicar no produto
        category.clickProductAddToProductPage();
        System.out.println("Clicou no produto");

        //adicionar ao carrinho
        pdp.clickButtonAddToCart();
        System.out.println("Adicionou o produto ao carrinho");
        pdp.clickButtonModalProceedToCheckout();
        System.out.println("Clicou no btn Proceed to checkout e foi para página SUMMARY");

        //avançar para Addresses
        summary.clickBtnCartProceedToCheckout();
        System.out.println("Clicou no btn Proceed to checkout e foi para página ADDRESSES");

        // avançar para Shipping
        addressesPage.clickBtnAddressesProceedToCheckout();
        System.out.println("Clicou no btn Proceed to checkout e foi para página SHIPPING");

        //clicar em I agree
        shippingPage.clickCheckIAgree();
        System.out.println("Clicou no btn I Aggree");


        //avançar para pagamento
        shippingPage.clickBtnShippingProceedToCheckout();
        System.out.println("Clicou no btn Proceed to checkout e foi para página PAYMENT");

        //clicar em paybybank
        paymentPage.clickBtnPaybyCheck();
        System.out.println("Clicou no btn PayByCheck");

        //clicar em confirm my order
        paymentPage.clickBtnIConfirmMyOrder();
        System.out.println("Clicou no btn IConfirmMyOrder");
    }
}