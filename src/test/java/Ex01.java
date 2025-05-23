import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ex01 {

    @Test
    public void test_openVWOLoginPage(){
        ChromeDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://app.vwo.com");
        chromeDriver.quit();


    }


}
