package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie4 {
    public static void main(String[] args) {
        String email = "testowynowak@wp.pl";
        String haslo = "1546cfsfDDA";
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/login");

        driver.findElement(By.id("email_create")).sendKeys(email);
        driver.findElement(By.id("SubmitCreate")).click();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Testowy");

        driver.findElement(By.xpath("//*[@id='customer_lastname']")).sendKeys("Nowak");
        driver.findElement(By.xpath("//*[@id=\"email\"]"));//.sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"passwd\"]")).sendKeys(haslo);
        driver.findElement(By.xpath("//*[@id=\"submitAccount\"]")).click();


    }
}
