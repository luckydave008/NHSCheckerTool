package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import uk.Nhs.Nhsbsa.Services.Test.LoadProp;
import uk.Nhs.Nhsbsa.Services.Test.Utils;

public class PregnantOrGivenBirthPage extends Utils {
    LoadProp loadProp = new LoadProp ();

    private By _heading    = By.cssSelector ("#question-heading");
    private By _optionNo = By.cssSelector ("#label-no");
    private By _nextBtn = By.cssSelector ("#next-button");

    public void verifyHeading() {
        Assert.assertEquals ( loadProp.getProperty ("pregnantOrGivenBirthInLast12MonthHeading"), Utils.getTextFromElement (_heading));
    }
    public void selectOptionNo(){
        Utils.waitForElementClickable (_optionNo,5);
        Utils.clickElementBy (_optionNo);
        Utils.clickElementBy (_nextBtn);

    }
}
