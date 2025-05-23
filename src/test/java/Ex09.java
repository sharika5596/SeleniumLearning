import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Ex09 {
    @Test
    public void test_katalon_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

//        WebElement make_appointment_btn_id = driver.findElement(By.id("btn-make-appointment"));
//        make_appointment_btn_id.click();

        driver.findElement(By.xpath("//a[@id='btn-make-appointment']")).click();
        List<WebElement> username_input_box_xpath_placeholder = driver.findElements(By.xpath("//input[@placeholder='Username']"));
        username_input_box_xpath_placeholder.get(1).sendKeys("John Doe");

        List<WebElement> password_input_box = driver.findElements(By.xpath("//input[@placeholder='Password']"));
        password_input_box.get(1).sendKeys("ThisIsNotAPassword");


        WebElement login_input_box = driver.findElement(By.xpath("//button[@id=\"btn-login\"]"));
        login_input_box.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");


    }
    }
