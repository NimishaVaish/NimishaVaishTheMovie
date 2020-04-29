package stepDefinitions;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverFactory;


public class android_MoviePage extends DriverFactory {

    @AndroidFindBy(xpath = "//*[@text='Cars']")
    AndroidElement MovieName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Summary']")
    AndroidElement Summary;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Movie']")
    AndroidElement MovieTab;

    @AndroidFindBy(className = "android.widget.RatingBar")
    AndroidElement RatingBar;

    @AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'Release Date')]")
    AndroidElement ReleaseDate;

    @AndroidFindBy(accessibility = "Navigate up")
    AndroidElement GoBack;

    @AndroidFindBy(xpath="//android.widget.TextView[@text='Star']")
    AndroidElement StarTab;

    @AndroidFindBy(xpath="//*[@text='Tom Cruise']")
    AndroidElement StarName;


    /**
     * user clicks on Movie name
     */
    public void clickOnMovie(){
        MovieName.click();
    }

    /**
     * user clicks on back button on the app
     */
    public void clickOnGoBack(){
        GoBack.click();
    }

    /**
     * user clicks on Star tab
     */
    public void clickOnStarTab(){
        StarTab.click();
    }

    /**
     * User clicks on Movie name
     */
    public void selectMovie() {
        if(MovieName.isDisplayed()) {
            clickOnMovie();
            System.out.println("User clicked on Movie name");
        }

    }

    /**
     * to check Movie tab is displayed in the app or not
     */
    public void movieTabIsDisplayed(){
        if(MovieTab.isDisplayed()){
            String movieTab = MovieTab.getText();
            Assert.assertEquals(movieTab,"Movie");
        }
    }

    /**
     * to verify Summary of the movie is displayed or not
     */
    public void summaryIsDisplayed() {
        if (Summary.isDisplayed()) {
            System.out.println("Summary is present");
            String summary= Summary.getText();
            Assert.assertEquals(summary,"Summary");
        }
    }

    /**
     * To verify Ratings of the movie is displayed or not
     */
    public void RatingBarIsDisplayed(){
        if(RatingBar.isDisplayed()){
            System.out.println("Ratings are present");
            String ratingBar= RatingBar.getText();
            Assert.assertEquals(ratingBar,"7.0");
        }
    }

    /**
     * To verify Release date of the movie is displayed or not
     */
    public void ReleaseDateIsDisplayed(){
        if( ReleaseDate.isDisplayed()){
            System.out.println("Release Date is present");
            String releaseDate = ReleaseDate.getText();
            Assert.assertEquals(releaseDate,"Release Date : 2006-06-08");
        }
    }

    /**
     * To verify star name is displayed or not
     */
    public void starNameIsDisplayed(){
        if(StarName.isDisplayed()){
            System.out.println("Star Name is present");
            String starName= StarName.getText();
            Assert.assertEquals(starName,"Tom Cruise");
        }


    }



    public android_MoviePage() {
        PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.driver), this);
    }

}