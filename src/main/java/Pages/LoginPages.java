package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static ObjectsPath.GitHubPaths.*;
import static ObjectsPath.LoginPaths.*;

public class LoginPages {

    WebDriver driver =null;


    public LoginPages(WebDriver driver) {
        //Constructor For the web driver 'chrome'
        this.driver=driver;
    }


    public void openGitUrl (){ //Opening GitHub Web, only one time

        driver.get("https://github.com/");

    }

    public void clickOnSignInBtn (){ //SigIn Button

        WebElement SignInBtn= driver.findElement(signIn);
        SignInBtn.click();
    }
    public void fillUserName (){ //UserName Form input

        WebElement UserName= driver.findElement(username);
        UserName.sendKeys("Bouthainh");

    }

    public void fillPassword(){ //Password Form input

        WebElement Email= driver.findElement(Epassword);
        Email.sendKeys("Bebo@2024");
    }

    public void ClickOnLogin(){ //Login Button

        WebElement loginBtn= driver.findElement(signInBtn);
        loginBtn.click();

    }

    public void clickOnSignUpBtn (){ //SigUp Button from the Home Page

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
