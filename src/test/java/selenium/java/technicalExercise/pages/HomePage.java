package selenium.java.technicalExercise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePage {

    @FindBy(xpath = "//section")
    private List<WebElement> sections;

    @FindBy(className = "description-service white-text")
    private WebElement section;



    public String getSectionTitleName() {
        return section.getAttribute("data-anchor");
    }




}
