import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class Ex06 {
    @Description("Options Class")
    @Test
    public void test_Selenium01() throws Exception {

        ChromeOptions edgeOptions = new ChromeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/Adblock.crx"));

        WebDriver driver = new ChromeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");


        driver.manage().deleteAllCookies();
        driver.quit();



    }
}
