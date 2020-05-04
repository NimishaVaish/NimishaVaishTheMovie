package stepDefinitions;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.support.PageFactory;
import utils.DriverFactory;
import java.time.Duration;

import static org.testng.Assert.*;


public class Android_MoviePage extends DriverFactory {

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[1]/android.widget.ImageView")
    AndroidElement MovieTile;

    @AndroidFindBy(xpath = "//android.widget.RelativeLayout[3]/android.widget.ImageView")
    AndroidElement ThirdMovieTile;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Summary']")
    AndroidElement SummaryTitle;

    @AndroidFindBy(id = "com.skydoves.themovies:id/detail_body_summary")
    AndroidElement SummaryContent;

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

    @AndroidFindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.RelativeLayout")
    AndroidElement StarName;


    /**
     * user clicks on the Movie Tile
     */
    public void clickOnMovie() {
        try {
            MovieTile.click();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    /**
     * @return true if user clicks on the Go Back button of the app
     */
    public boolean clickOnGoBack() {
        try {
        GoBack.click();

        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    /**
     * @return true if user clicks on Star tab
     */
    public boolean clickOnStarTab() {
        try {
            StarTab.click();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if user clicks on TV tab
     */
    public boolean clickOnTVTab() {
        try{
        TVTab.click();
    }catch(Exception e){
        e.printStackTrace();
    }
        return true;
    }

    /**
     * @return true if user clicks on Movie tab
     */
    public boolean clickOnMovieTab() {
        try{
        MovieTab.click();
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if user clicks on Movie name
     */
    public boolean selectMovie() {
        try{
        if (MovieTile.isDisplayed()) {
            clickOnMovie();
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if Movie tab is displayed
     */
    public boolean movieTabIsDisplayed() {
        try{
        if (MovieTab.isDisplayed()) {
            String movieTab = MovieTab.getText();
            assertEquals(movieTab, "Movie");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if TV tab is displayed and content is present
     */
    public boolean tvContentIsDisplayed() {
        try{

        if (TVTab.isDisplayed()) {
            String tvContent = TvContent.getText();
            System.out.println("Tv content title is: "+tvContent);
        }
    }catch(Exception e){
        e.printStackTrace();
    }
        return true;
    }

    /**
     * @return true if Summary of the movie is displayed
     */
    public boolean summaryIsDisplayed() {
        try{
        if (SummaryTitle.isDisplayed()) {
            String summaryContent = SummaryContent.getText();
            assertFalse(summaryContent.isEmpty());
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if Ratings of the movie is displayed
     */
    public boolean RatingBarIsDisplayed() {
        try{
        if (RatingBar.isDisplayed()) {
            System.out.println("Ratings are present");
            String ratingBar = RatingBar.getText();
            assertEquals(ratingBar, "7.0");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }
    /**
     * @return true if Release date of the movie is displayed
     */
    public boolean ReleaseDateIsDisplayed() {
        try{
        if (ReleaseDate.isDisplayed()) {
            System.out.println("Release Date is present");
            String releaseDate = ReleaseDate.getText();
            assertEquals(releaseDate, "Release Date : 2006-06-08");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }


    /**
     * @return true if starName is displayed
     */
    public boolean starNameIsDisplayed() {
        try{
        if (StarName.isDisplayed()) {
            System.out.println("Star Name is present");
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return  true if coordinates of the movie have changed after scrolling down
     */
    public boolean scrollDown() {


        try {
            int Xinitial = ThirdMovieTile.getLocation().getX();
            int Yinitial = ThirdMovieTile.getLocation().getY();
            System.out.println("Initial Coordinates are: " + Xinitial + " " + Yinitial);
            PointOption initialPt = new PointOption().withCoordinates(Xinitial, Yinitial);

            int Xfinal = MovieTile.getLocation().getX();
            int Yfinal = MovieTile.getLocation().getY();
            System.out.println("Final Coordinates are: " + Xfinal + " " + Yfinal);
            PointOption newPt = new PointOption().withCoordinates(Xfinal, Yfinal);

            TouchAction action = new TouchAction(driver);

            action.press(initialPt).waitAction(WaitOptions.waitOptions(Duration.ofMillis(3000))).moveTo(newPt).release().perform();
            Thread.sleep(2000);

            int XafterScroll = MovieTile.getLocation().getX();
            int YafterScroll = MovieTile.getLocation().getY();

            if(XafterScroll!=Xinitial && YafterScroll!=Yinitial){
                System.out.println("User is able to scroll down");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /**
     * @return true if new movie is displayed
     */
    public boolean verifyMovieIsDisplayed(){
        assertTrue(MovieTile.isDisplayed());
        return true;

    }


    public Android_MoviePage() {
            PageFactory.initElements(new AppiumFieldDecorator(DriverFactory.driver), this);
        }

    }
