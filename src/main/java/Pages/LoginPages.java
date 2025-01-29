package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.GitHubPaths.*;

public class LoginPages {

    WebDriver driver =null;


    public LoginPages(WebDriver driver) {
        //Constructor For the web driver 'chrome'
        this.driver=driver;
    }


    public void openGitUrl (){ //Opening GitHub Web, only one time

        driver.get("https://github.com/");

    }

    public void clickOnSignInBtn (){ //SigIn Element

        WebElement SignInBtn= driver.findElement(signIn);
        SignInBtn.click();
    }
    public void clickOnSignUpBtn (){ //SigUp Element

        WebElement SignUpBtn= driver.findElement(SignUp);
        SignUpBtn.click();
    }

    public void clickOnService (){ //Services Element

        WebElement ServBtn= driver.findElement(TearmsOfService);
        ServBtn.click();//GitHubPrivacy
    }

    public void clickOnPrivacy (){ //Privacy Element

        WebElement PrivacyBtn= driver.findElement(GitHubPrivacy);
        PrivacyBtn.click();
    }
    public void clickOnPricing (){ //Pricing Element

        WebElement PriceBtn= driver.findElement(Pricing);
        PriceBtn.click();
    }
}
