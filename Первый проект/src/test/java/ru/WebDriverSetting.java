package ru;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetting {

    public ChromeDriver driver;

    @Before
        public void sesUp(){
        System.setProperty("webdriver.chrome.driver","D:\\GitHub\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
        public void close() {
        driver.quit();
    }
}
