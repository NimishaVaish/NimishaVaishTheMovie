package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoviePage_Steps extends Android_MoviePage {


    @Given("^user is on Movie page$")
    public void onMoviePage() {
        movieTabIsDisplayed();
    }

    @When("^user clicks on first Movie$")
    public void userClicksOnFirstMovie() {
        selectMovie();
    }

    @Then("^verify Summary is displayed$")
    public void MovieSummaryIsDisplayed() {
        summaryIsDisplayed();

    }

    @Then("^verify Ratings is displayed$")
    public void ratingsIDisplayed(){
        RatingBarIsDisplayed();
    }

    @Then("^verify ReleaseDate is displayed$")
    public void releaseDateIsDisplayed(){
        ReleaseDateIsDisplayed();
    }
    @Then("^user clicks on  go back tab$")
    public void clickingOnGoBackButton(){
        clickOnGoBack();
    }
    @When("^user clicks on star tab$")
    public void clicksOnStarTab(){
        clickOnStarTab();
    }
    @Then("^verify star name is present$")
    public void verifyStarNameIsDisplayed(){
        starNameIsDisplayed();
    }
    @When("^user clicks on TV tab$")
    public void clickingOnTVTab(){
         clickOnTVTab();
    }
    @Then("^verify Tv content is displayed$")
   public void verifyTvContentIsDisplayed(){
        tvContentIsDisplayed();
    }
    @When("^user clicks on Movie tab$")
    public void clicksOnMovieTab(){
        clickOnMovieTab();
    }
    @Then("^verify Movie tab is displayed$")
    public void verifyMovieTabIsDisplayed(){
        movieTabIsDisplayed();
    }


}
