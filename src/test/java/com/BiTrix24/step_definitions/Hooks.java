package com.BiTrix24.step_definitions;

import com.BiTrix24.utilities.Driver;
import io.cucumber.java.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {


    @Before
    public void setUpScenario(){
        System.out.println("-----> Before annotation: Setting up browser");
    }




    @After(order = 1)
    public void tearDownScenario(Scenario scenario){
        //System.out.println("-----> After annotation: Closing browser");
        //System.out.println("scenario.getName() = " + scenario.getName());
        //System.out.println("scenario.getSourceTagNames() = " + scenario.getSourceTagNames());
        //System.out.println("scenario.isFailed() = " + scenario.isFailed());


        //#1 we need to take a screen shot using SELENIUM -->
        // getScreenshotAs: to be able to use this method we have to cast our driver type to TakesScreenshot


        //#2 we are going to attach it into our report
        //attach method accepts 3 arguments. #1: Screenshot itself #2: image type #3 current scenario's name

        if(scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }



    }








    @After(order = 2)
    public void tearDown() throws InterruptedException{
        Thread.sleep(10000);
        Driver.closeDriver();

    }







}