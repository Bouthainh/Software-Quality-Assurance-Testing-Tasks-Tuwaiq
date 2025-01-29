package ObjectsPath;

import org.openqa.selenium.By;

public class GitHubPaths {

    public static final By signIn = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a");
    public static final By username = By.xpath("//input[@id='login_field']");
    public static final By password = By.xpath("//input[@id='password']");

    public static final By signInBtn = By.xpath("//input[@name='commit']");

    public static final By SignUp = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/a");//step.1
    public static final By TearmsOfService = By.xpath("//*[Contains (text(),'Terms of Service')]");
    public static final By GitHubPrivacy = By.xpath("//*[Contains (text(),'GitHub Privacy Statement')] ");
    public static final By Pricing = By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/nav/ul/li[6]/a");


}
