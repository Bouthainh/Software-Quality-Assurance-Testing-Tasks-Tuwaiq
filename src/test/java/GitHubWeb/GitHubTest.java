package GitHubWeb;

import Base.BaseClass;
import Pages.LoginPages;
import org.testng.annotations.Test;

public class GitHubTest extends BaseClass {

    @Test
    public void loginPageMethod() throws InterruptedException { //Test for login
        LoginPages login = new LoginPages(driver);

        login.openGitUrl();
        login.clickOnSignInBtn();

    }
    @Test
    public void SignUpPageMethod() throws InterruptedException { //Test for SignUp
        LoginPages SignUp = new LoginPages(driver);

        SignUp.openGitUrl();
        SignUp.clickOnSignUpBtn();
    }

    @Test
    public void ServiceMethod() throws InterruptedException { //Test for Services
        LoginPages Serve = new LoginPages(driver);

        Serve.openGitUrl();
        Serve.clickOnSignUpBtn();
    }

    @Test
    public void PrivacyMethod() throws InterruptedException { //Test for Privacy
        LoginPages Privacy = new LoginPages(driver);

        Privacy.openGitUrl();
        Privacy.clickOnSignUpBtn();
    }
    @Test
    public void PricingMethod() throws InterruptedException { //Test for Privacy
        LoginPages Pricing = new LoginPages(driver);

        Pricing.openGitUrl();
        Pricing.clickOnPricing();
    }

}
