import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Ex08 {
    @Test
    public void vwo_free_trail_error_verify() throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com");


        WebElement a_tag_partial_match = driver.findElement(By.partialLinkText("trial"));
        a_tag_partial_match.click();

        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        driver.findElement(By.id("page-v1-step1-email")).sendKeys("abc");
        driver.findElement(By.name("gdpr_consent_checkbox")).click();
        driver.findElement(By.tagName("button")).click();
        Thread.sleep(3000);
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(), "The email address you entered is incorrect.");
        driver.quit();
    }

    }

