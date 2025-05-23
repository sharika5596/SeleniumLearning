import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex04 {
    @Test
    public void test_Selenium01() throws Exception {

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com"); // 95%

        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();




    }
}
