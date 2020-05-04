$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Movie_Android.feature");
formatter.feature({
  "line": 1,
  "name": "Movie",
  "description": "",
  "id": "movie",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10556239754,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User clicks on Movie to see Summary of the Movie",
  "description": "",
  "id": "movie;user-clicks-on-movie-to-see-summary-of-the-movie",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user clicks on first Movie",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verify Summary is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 2892736173,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 328096445,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.movieSummaryIsDisplayed()"
});
formatter.result({
  "duration": 1670180212,
  "status": "passed"
});
formatter.after({
  "duration": 147567928,
  "status": "passed"
});
formatter.before({
  "duration": 10699075625,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User checks the review rating of the movie is displayed",
  "description": "",
  "id": "movie;user-checks-the-review-rating-of-the-movie-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "user clicks on first Movie",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "verify Ratings is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 2150896920,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 437102024,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.ratingsIDisplayed()"
});
formatter.result({
  "duration": 1613666945,
  "status": "passed"
});
formatter.after({
  "duration": 199681105,
  "status": "passed"
});
formatter.before({
  "duration": 8899311975,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User checks the Release date of the movie is displayed",
  "description": "",
  "id": "movie;user-checks-the-release-date-of-the-movie-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "user clicks on first Movie",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "verify ReleaseDate is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 3431762247,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 500695343,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.releaseDateIsDisplayed()"
});
formatter.result({
  "duration": 1698260400,
  "status": "passed"
});
formatter.after({
  "duration": 199555743,
  "status": "passed"
});
formatter.before({
  "duration": 11503173244,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User navigates between Movie and Star tab",
  "description": "",
  "id": "movie;user-navigates-between-movie-and-star-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 24,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 26,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 27,
  "name": "user clicks on first Movie",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "user clicks on  go back tab",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user clicks on star tab",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "verify star name is present",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 2894549336,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 447899880,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clickingOnGoBackButton()"
});
formatter.result({
  "duration": 1499260286,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clicksOnStarTab()"
});
formatter.result({
  "duration": 900406649,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyStarNameIsDisplayed()"
});
formatter.result({
  "duration": 998191330,
  "status": "passed"
});
formatter.after({
  "duration": 101818235,
  "status": "passed"
});
formatter.before({
  "duration": 11398218615,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User navigates between Movie and TV tab",
  "description": "",
  "id": "movie;user-navigates-between-movie-and-tv-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 35,
  "name": "user clicks on TV tab",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "verify Tv content is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 37,
  "name": "user clicks on Movie tab",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "verify Movie tab is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 2146738130,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clickingOnTVTab()"
});
formatter.result({
  "duration": 249592945,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyTvContentIsDisplayed()"
});
formatter.result({
  "duration": 1050928709,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clicksOnMovieTab()"
});
formatter.result({
  "duration": 198390769,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyMovieTabIsDisplayed()"
});
formatter.result({
  "duration": 1011233971,
  "status": "passed"
});
formatter.after({
  "duration": 188469121,
  "status": "passed"
});
formatter.before({
  "duration": 7308568860,
  "status": "passed"
});
formatter.scenario({
  "line": 41,
  "name": "User is able to scroll down in the Movie section and new movie is displayed",
  "description": "",
  "id": "movie;user-is-able-to-scroll-down-in-the-movie-section-and-new-movie-is-displayed",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 40,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 42,
  "name": "user is on Movie tab",
  "keyword": "Given "
});
formatter.step({
  "line": 43,
  "name": "user scrolls down",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "verify the new movie is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MoviePage_Steps.userIsOnMoviePage()"
});
formatter.result({
  "duration": 2433545046,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.scrollDownThePage()"
});
formatter.result({
  "duration": 6249864739,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyScrollPositionOfTheMovie()"
});
formatter.result({
  "duration": 161851605,
  "status": "passed"
});
formatter.after({
  "duration": 138426822,
  "status": "passed"
});
});