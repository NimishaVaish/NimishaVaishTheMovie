package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.testng.Assert.assertTrue;

public class MoviePage_Steps extends Android_MoviePage {


    @Given("^user is on Movie tab$")
    public void userIsOnMoviePage() {
        assertTrue(movieTabIsDisplayed());
    }

    @When("^user clicks on first Movie$")
    public void userClicksOnFirstMovie()
    {
        assertTrue(selectMovie());
    }

    @Then("^verify Summary is displayed$")
    public void movieSummaryIsDisplayed() {
        assertTrue(summaryIsDisplayed());

    }

    @Then("^verify Ratings is displayed$")
    public void ratingsIDisplayed()
    {
        assertTrue(RatingBarIsDisplayed());
    }

    @Then("^verify ReleaseDate is displayed$")
    public void releaseDateIsDisplayed(){

        assertTrue(ReleaseDateIsDisplayed());
    }
    @Then("^user clicks on  go back tab$")
    public void clickingOnGoBackButton()
    {
        assertTrue(clickOnGoBack());
    }
    @When("^user clicks on star tab$")
    public void clicksOnStarTab()
    {
        assertTrue(clickOnStarTab());
    }
    @Then("^verify star name is present$")
    public void verifyStarNameIsDisplayed()
    {
        starNameIsDisplayed();
    }
    @When("^user clicks on TV tab$")
    public void clickingOnTVTab(){
         assertTrue(clickOnTVTab());
    }
    @Then("^verify Tv content is displayed$")
   public void verifyTvContentIsDisplayed(){
        assertTrue(tvContentIsDisplayed());
    }
    @When("^user clicks on Movie tab$")
    public void clicksOnMovieTab(){
        assertTrue(clickOnMovieTab());
    }
    @Then("^verify Movie tab is displayed$")
    public void verifyMovieTabIsDisplayed(){
        assertTrue(movieTabIsDisplayed());
    }
    @When("^user scrolls down$")
    public void scrollDownThePage(){
        assertTrue(scrollDown());
    }
    @Then("^verify the new movie is displayed")
    public void verifyScrollPositionOfTheMovie(){
        assertTrue(verifyMovieIsDisplayed());

    }


}
