import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDrayver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10 ,TimeUnit SECONDS);
        WebDriverWait wait = new WebDriverWait (driver, 1000);

        try {
            driver.get("http://127.0.0.1:5500/index.html");
            Thread.sleep(5000);

            WebElenent elenent = driver.findElenent(By id("a"));
            WebElenent elenent2 = driver.findElenent(By id("b"));
            WebElenent elenent3 = driver.findElenent(By id("c"));

            elenent.click();


            Alert alert = wait.until();















    }
}
