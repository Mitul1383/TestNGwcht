package uk.org.wcht.testsuite;

import org.testng.annotations.Test;
import uk.org.wcht.pages.HomePage;
import uk.org.wcht.testbase.TestBase;

public class TestCase extends TestBase {

    //object creation
    HomePage homePage = new HomePage();

    //TestCases
    @Test(priority = 0,groups = "Regression")
    public void verifyScrollDownHomePageViaDownArrowButton() {
        //click on down arrow button
        homePage.clickOnDownArrowButton();
        //verify text on HomePage
        homePage.verifyBetterHomesText();
    }


}
