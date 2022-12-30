import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DriverTest {
    private ChromeDriver driver;

    @Before
    public void createDriver() {
        driver = new ChromeDriver();
        driver.get("https://mangalib.me/");
    }

    @Test
    public void whenClickAddToCartThenCartIsUpdated() {
        WebElement element = driver.findElement(By.xpath("//*[@id=\"site_type\"]/body/div[2]/div/div[2]/div/div[1]/span"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"tippy-2\"]/div/div/div/a[8]"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"main-page\"]/div/div/div[2]/div[1]/div[1]/div/div[7]/div[2]/label[1]/span[1]"));
        element.click();
        element = driver.findElement(By.xpath("//*[@id=\"main-page\"]/div/div/div[2]/div[1]/div[2]/button[2]"));
        element.click();
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"manga-list\"]/div/div/div[40]"));
        Assert.assertEquals(1, elements.size());

    }

    @After
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
