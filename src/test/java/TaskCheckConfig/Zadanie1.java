package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotel-testlab.coderslab.pl/en/");
        driver.findElement(By.id("hotel_location"));

        WebElement element = driver.findElement(By.id("hotel_location"));
        element.clear();
        element.sendKeys("Warsaw");


     driver.findElement(By.name("search_room_submit"));

        WebElement email = driver.findElement(By.id("newsletter-input"));
        email.clear();
        email.sendKeys("test@test.com");


    }
}


