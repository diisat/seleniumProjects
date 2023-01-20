package selenium.java.technicalExercise.tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import selenium.java.technicalExercise.pages.HomePage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class NavigationTest extends BaseTest{

    private HomePage homePage;
    private JavascriptExecutor js ;



    @Test
    public void navigationTest() throws InterruptedException {

        homePage=new HomePage(driver);
        js = (JavascriptExecutor) driver;

        //Industry Section
        ArrayList<String> labelsToCheck_industrySection= new ArrayList<String>();
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/logistics-transportation/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/oil-gas/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/it-solutions-for-telecom-industry/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/technology-innovation/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/financial-services/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/healthcare-life-sciences/");
        labelsToCheck_industrySection.add("http://www.teaminternational.com/industries/it-hospitality-solutions/");


        List<WebElement> elements = homePage.getIndustrySmallSections();

        for (int i = 0; i < labelsToCheck_industrySection.size(); i++) {
            String smallSection = homePage.getIndustrySmallSections().get(i).getAttribute("href");
            Assert.assertEquals(smallSection,labelsToCheck_industrySection.get(i));
        }

        Thread.sleep(100);


       /** String sectionn="";
        for (int i = 0; i < homePage.getSections().size(); i++) {
            sectionn = homePage.getSections().get(i).getAttribute("data-anchor");

        }**/

       //scroll until next section
        js.executeScript("arguments[0].scrollIntoView();", homePage.getSections().get(0));



    }


}
