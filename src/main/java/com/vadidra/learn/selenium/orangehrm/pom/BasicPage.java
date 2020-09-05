package com.vadidra.learn.selenium.orangehrm.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasicPage {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasicPage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;

    }

    abstract public void navigateTo() throws Exception;
    abstract public boolean isAt() throws Exception;

    public String getTitle(){
        return this.driver.getTitle();
    }


}
