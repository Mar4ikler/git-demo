    package base_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MangalibPage extends BasePage {
    public MangalibPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@id=\"site_type\"]/body/div[2]/div/div[2]/div/div[1]/span")
    private WebElement catalogButton;
    @FindBy(xpath = "//*[@id=\"tippy-2\"]/div/div/div/a[8]")
    private WebElement catalogAll;
    @FindBy(xpath = "//*[@id=\"main-page\"]/div/div/div[2]/div[1]/div[1]/div/div[7]/div[2]/label[1]/span[1]")
    private WebElement mangaFilter;
    @FindBy(xpath = "//*[@id=\"main-page\"]/div/div/div[2]/div[1]/div[2]/button[2]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"main-page\"]/div/div/div/div[1]/div[2]/a")
    private WebElement startReading;
    @FindBy(xpath = "//*[@id=\"manga-list\"]/div/div/div[2]/a")
    private WebElement manga;

    public MangalibPage clickCatalogButton() {
        catalogButton.click();
        return this;
    }
    public MangalibPage clickCatalogAll() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(catalogAll))
                .click();
        return this;
    }
    public MangalibPage clickMangaFilter() {
        mangaFilter.click();
        return this;
    }
    public MangalibPage clickSearchButton(){
        searchButton.click();
        return this;
    }
    public MangalibPage clickManga() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(manga))
                .click();
        return this;
    }
    public MangalibPage clickStartReading() {
        new WebDriverWait(driver, WAIT_TIMEOUT_SECONDS).until(
                        ExpectedConditions.elementToBeClickable(startReading))
                .click();
        return this;
    }


}