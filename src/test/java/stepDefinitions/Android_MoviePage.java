package stepDefinitions;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.DriverFactory;


public class Android_MoviePage extends DriverFactory {

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.ImageView")
    AndroidElement MovieName;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Summary']")
    AndroidElement Summary;

    @AndroidFindBy(id = "com.skydoves.themovies:id/detail_body_summary")
    AndroidElement SummaryBody;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    AndroidElement TvContent;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Movie']")
    AndroidElement MovieTab;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Tv']")
    AndroidElement TVTab;

    @AndroidFindBy(className = "android.widget.RatingBar")
    AndroidElement RatingBar;

    @AndroidFindBy(xpath = "//android.widget.TextView[contains(@text,'Release Date')]")
    AndroidElement ReleaseDate;

    @AndroidFindBy(accessibility = "Navigate up")
    AndroidElement GoBack;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Star']")
    AndroidElement StarTab;

    @AndroidFindBy(xpath = "//*[@text='Tom Cruise']")
    AndroidElement StarName;


    /**
     * user clicks on Movie name
     */
    public void clickOnMovie() {
        try {
            MovieName.click();
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * user clicks on back button on the app
     */
    public void clickOnGoBack() {
        try {
        GoBack.click();
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * user clicks on Star tab
     */
    public void clickOnStarTab() {
        try{
        StarTab.click();
    }catch(NoSuchElementException e){
        System.out.println("Element is not present"+e);
    }
    }

    /**
     * user clicks on TV tab
     */
    public void clickOnTVTab() {
        try{
        TVTab.click();
    }catch(NoSuchElementException e){
        System.out.println("Element is not present"+e);
    }
    }

    /**
     * user clicks on Movie tab
     */
    public void clickOnMovieTab() {
        try{
        MovieTab.click();
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * User clicks on Movie name
     */
    public void selectMovie() {
        try{
        if (MovieName.isDisplayed()) {
            clickOnMovie();
            System.out.println("User clicked on Movie name");
        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }

    }


    /**
     * to check Movie tab is displayed in the app or not
     */
    public void movieTabIsDisplayed() {
        try{
        if (MovieTab.isDisplayed()) {
            String movieTab = MovieTab.getText();
            Assert.assertEquals(movieTab, "Movie");
        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * to check TV tab is displayed and content is present in the app or not
     */
    public void tvContentIsDisplayed() {
        try{

        if (TVTab.isDisplayed()) {
            String tvContent = TvContent.getText();
            System.out.println("Tv content title is: "+tvContent);
            Assert.assertTrue(TvContent.isDisplayed());
        }
    }catch(NoSuchElementException e){
        System.out.println("Element is not present"+e);
    }
    }


    /**
     * to verify Summary of the movie is displayed or not
     */
    public void summaryIsDisplayed() {
        try{
        if (Summary.isDisplayed()) {
            Assert.assertTrue(SummaryBody.isDisplayed());

        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * To verify Ratings of the movie is displayed or not
     */
    public void RatingBarIsDisplayed() {
        try{
        if (RatingBar.isDisplayed()) {
            System.out.println("Ratings are present");
            String ratingBar = RatingBar.getText();
            Assert.assertEquals(ratingBar, "7.0");
        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * To verify Release date of the movie is displayed or not
     */
    public void ReleaseDateIsDisplayed() {
        try{
        if (ReleaseDate.isDisplayed()) {
            System.out.println("Release Date is present");
            String releaseDate = ReleaseDate.getText();
            Assert.assertEquals(releaseDate, "Release Date : 2006-06-08");
        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }

    /**
     * To verify star name is displayed or not
     */
    public void starNameIsDisplayed() {
        try{
        if (StarName.isDisplayed()) {
            System.out.println("Star Name is present");
            String starName = StarName.getText();
            Assert.assertEquals(starName, "Tom Cruise");
        }
        }catch(NoSuchElementException e){
            System.out.println("Element is not present"+e);
        }
    }


    public Android_MoviePage() {
            PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.driver), this);
        }

    }
