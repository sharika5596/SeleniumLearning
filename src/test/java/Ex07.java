import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex07 {
    @Test
    public void test_openVWOLoginPage() throws InterruptedException {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com");

        driver.findElement(By.id("login-username")).sendKeys("admin");
        driver.findElement(By.id("login-password")).sendKeys("admin");
        driver.findElement(By.id("js-login-btn")).click();
        WebElement result = driver.findElement(By.id("js-notification-box-msg"));
        Thread.sleep(3000);
        Assert.assertEquals(result.getText(),"Your email, password, IP address or location did not match");
        driver.quit();


    }
}
