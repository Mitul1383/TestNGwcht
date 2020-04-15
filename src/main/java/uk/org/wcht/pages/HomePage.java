package uk.org.wcht.pages;

import org.openqa.selenium.By;
import uk.org.wcht.utility.Utility;

public class HomePage extends Utility {

    //list of elements and their locations
    By downArrowButton = By.xpath("//button[@class='home-carousel__down-arrow js-to-content']");
    By betterHomesText = By.xpath("//div[@class='grid-column']//h1");

    //methods performing actions on elements
    public void clickOnDownArrowButton() {
        clickOnElement(downArrowButton);
    }

    public void verifyBetterHomesText() {
        verifyTextAssertMethod(betterHomesText,"Better homes, friendlier communities – together");
    }

}
