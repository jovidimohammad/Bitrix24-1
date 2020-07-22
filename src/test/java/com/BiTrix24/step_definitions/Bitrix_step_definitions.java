package com.BiTrix24.step_definitions;

import com.BiTrix24.Pages.Bitrix24;
import com.BiTrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class Bitrix_step_definitions {

    Bitrix24 bitrix24 =new Bitrix24();
    WebDriver driver = Driver.getDriver();
    Actions actions=new Actions(driver);

    @Given("User already logged in  and on main page")
    public void user_already_logged_in_and_on_main_page() {

        bitrix24.loginAsHelpDesk();
    }

    @When("As a user, I should be able to create a poll by clicking on Poll tab under Active Stream")
    public void as_a_user_i_should_be_able_to_create_a_poll_by_clicking_on_poll_tab_under_active_stream() {
        WebElement poll = driver.findElement(By.xpath("//*[@id='feed-add-post-form-tab-vote']/span"));

        actions.moveToElement(poll).click().perform();
    }

    @Then("User should be able to upload files and pictures from local disks")
    public void user_should_be_able_to_upload_files_and_pictures_from_local_disks() {

       WebElement uploadButton = driver.findElement(By.xpath("//*[@id='bx-b-uploadfile-blogPostForm']"));
       actions.moveToElement(uploadButton).click().perform();

    }




}
