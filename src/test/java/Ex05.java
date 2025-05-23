import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class Ex05 {
    public static void main(String[] args) throws InterruptedException {

        ChromeOptions Options = new ChromeOptions();
        // FirefoxOptions, ChromeOptions, SafariOptions

        // EdgeOptions -> It will help you set the browser
        // options to browsers
        // window - size
        // headless mode - there is not UI -> advantage - Fast Execution
        // full UI mode - default - UI browser
        // incognito mode - switch
        // start Max
        // add extensions - browsers
        // 100 + others , https , http
        // localstorage, download ?


//        edgeOptions.addArguments("--window-size=1280,720");
//        edgeOptions.addArguments("--window-size=800,600");
        Options.addArguments("--incognito");
        Options.addArguments("--start-maximized");

        ChromeDriver driver = new ChromeDriver(Options);

        Thread.sleep(5000);
        driver.quit();



    }
}
