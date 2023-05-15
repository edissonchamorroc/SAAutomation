package com.dummi.selector;

import org.openqa.selenium.By;

public class SpaceAdvisorSelectors {

    public static final String DAY = "//div[@class='theme__day___3cb3g' and contains(.,'%s')]";
    public static final By BTN_IN_TO_LOGIN = By.xpath("//button[contains(.,'Log')]");
    public static final By INP_USER = By.xpath("//form[@id='login']//input[@type='text']");
    public static final By INP_PASS = By.xpath("//form[@id='login']//input[@type='password']");
    public static final By BTN_LOGIN = By.xpath("//form[@id='login']//input[@type='password']");


    public static final By BTN_NEXT_CALENDAR = By.xpath("//button[@id='right']");
    public static final By TXT_DATE_CALENDAR =By.xpath("//span[@class='theme__title___2Ue3-']");
    public static final By BTN_OK = By.xpath("//button[contains(.,'Ok')]");
    public static final By INPUT_DEPARTING =By.xpath("(//div[@class='theme__input___qUQeP theme__input___1TiDt theme__input___1TiDt']//input)[1]");
    public static final By INPUT_RETURNING = By.xpath("(//div[@class='theme__input___qUQeP theme__input___1TiDt theme__input___1TiDt']//input)[2]");

}
