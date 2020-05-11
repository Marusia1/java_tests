import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class AutorizationTest {
  ChromeOptions opt = new ChromeOptions();

  @Before
  public void setUp() {
    opt.setBinary("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
    opt.addArguments("start-maximized");
    opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
    opt.setExperimentalOption("useAutomationExtension", false);
    Map prefs = new HashMap();
    prefs.put("credentials_enable_service", false);
    prefs.put("profile.password_manager_enabled", false);
    opt.setExperimentalOption("prefs", prefs);
  }

  @After
  public void tearDown() {
    //driver.quit();
  }

  @Test
  public void autorization() throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
    WebDriver driver = new ChromeDriver(opt);
    driver.get("https://05.ru/");
    driver.findElement(By.cssSelector(".confirmed-city_btn__js")).click();
    Thread.sleep(6000);
    driver.findElement(By.cssSelector(".main-login-modal__js")).click(); // Клик Вход
    driver.findElement(By.name("AUTH[LOGIN]")).click();
    driver.findElement(By.name("AUTH[LOGIN]")).sendKeys("79884449824");
    driver.findElement(By.name("AUTH[PASSWORD]")).click();
    driver.findElement(By.name("AUTH[PASSWORD]")).sendKeys("Qa123123");
    driver.findElement(By.cssSelector(".bem-button_red")).click(); // клик  Войти
    Thread.sleep(5000);
    driver.findElement(By.cssSelector(".header__sub-auth>div>:nth-child(2)>a.bem-link")).click(); // клик  Выйти
  }

}
