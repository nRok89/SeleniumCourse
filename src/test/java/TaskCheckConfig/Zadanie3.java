package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl//en/");

        driver.findElement(By.className("user_login"));
       // WebElement element = driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[7]/ul/li/a"));
        WebElement element = driver.findElement(By.className("is_required"));
        element.clear();
        element.sendKeys("Coderslattb@coderslab.pl");

        driver.findElement(By.xpath("//*[@id='SubmitCreate']")).click();
    //  driver.findElement(By.xpath("//*[@id="SubmitCreate"]")).click();



    }
}
