package com.BiTrix24.Pages;

import com.BiTrix24.utilities.ConfigurationReader;
import com.BiTrix24.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bitrix24 {

    public Bitrix24(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "USER_LOGIN")
    public WebElement loginbox;

    @FindBy(name = "USER_PASSWORD")
    public WebElement paswordbox;



    public void loginAsHelpDesk(){
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrixurl"));
        loginbox.sendKeys(ConfigurationReader.getProperty("helpdeskuser"));
        paswordbox.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);


    }

    public void loginAsMarketingUser(){
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrixurl"));
        loginbox.sendKeys(ConfigurationReader.getProperty("marketinguser"));
        paswordbox.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);

    }

    public void loginAsHrUser(){
        Driver.getDriver().get(ConfigurationReader.getProperty("bitrixurl"));
        loginbox.sendKeys(ConfigurationReader.getProperty("hruser"));
        paswordbox.sendKeys(ConfigurationReader.getProperty("password")+ Keys.ENTER);


    }

    @FindBy(id="question_0")
    public WebElement questionBox;

}
