package selenium.java.technicalExercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePage extends BasePage{


    public HomePage(WebDriver driver){
        super(driver);
    }

    @FindBy(xpath = "//section[contains(@class,\"fp-section fp-table\")]")
    private List<WebElement> sections;

    @FindBy(xpath = "//div[contains(@class,\"industrial-item\")]/a")
    private List<WebElement> industrySmallSections;

    @FindBy(className = "services-row g-0 row")
    private List<WebElement> servicesSectionLabels;









    public String getSectionTitleName(WebElement section) {
        return section.getAttribute("data-anchor");
    }

    public List<WebElement> getSections(){
        return sections;
    }

    public List<WebElement> getIndustrySmallSections(){
        return industrySmallSections;
    }

    public String getRefFromSmallSection(WebElement webElement){
        return webElement.getAttribute("href").toString();
    }

    public void sendText(WebElement element,String text){
        element.clear();
        element.sendKeys(text);
    }

    public String getTitleByRef(WebDriver driver, String label){

        String title = driver.findElement(By.xpath("//a[contains(@href,'/industries/"+label+"/')]//following::h3")).getText();
        driver.findElement(By.xpath("//a[contains(@href,'/industries/"+label+"/')]//following::h3")).click();
        return title;

    }



}
