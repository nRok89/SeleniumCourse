package TaskCheckConfig;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zadanie5 {
    public static void main(String[] args) {

            String email = "testowynowak@wp.pl";
            String haslo = "1546cfsfDDA";
            System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://hotel-testlab.coderslab.pl/en/login");

           driver.findElement(By.id("email")).sendKeys(email);

       driver.findElement(By.id("passwd")).sendKeys(haslo);



           driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();



            driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(5) > a > i"));

            driver.findElement(By.cssSelector("#center_column > div > div > ul > li:nth-child(4) > a > i"));



        }
    }








