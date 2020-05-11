import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mymy extends WebDriverSetting {

    @Test
    public void firstTest1 () {
        driver.get("http://05.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("05.RU – интернет-магазин"));
    }

    @Test
    public void firstTest2() {
        driver.get("http://05.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("05.RU – интернет-магазин"));
    }

}
