package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class moviePage_Steps extends android_MoviePage {


    @Given("^user is on Movie page$")
    public void onMoviePage() {
        movieTabIsDisplayed();
    }

    @When("^user clicks on Cars Movie$")
    public void userClicksOnCarsMovie() {
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


}
