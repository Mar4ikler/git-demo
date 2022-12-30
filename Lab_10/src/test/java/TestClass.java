import base_page.MangalibPage;
import base_page.BasePage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestClass {
    private WebDriver driver;

    @Before
    public void setUp() {
        final ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);

    }

    @Test
    public void test() throws InterruptedException {
        driver.get("https://mangalib.me");
        MangalibPage mangalibPage = new MangalibPage(driver);
        mangalibPage.clickCatalogButton();
        mangalibPage.clickCatalogAll();
        mangalibPage.clickMangaFilter();
        mangalibPage.clickSearchButton();
        Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        driver.get("https://mangalib.me");
        MangalibPage mangalibPage = new MangalibPage(driver);
        mangalibPage.clickCatalogButton();
        mangalibPage.clickCatalogAll();
        mangalibPage.clickManga();
        mangalibPage.clickStartReading();
        Thread.sleep(5000);
    }

    @After
    public void clearResources() {
        new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.quit();
        driver = null;
    }
}
