$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Movie_Android.feature");
formatter.feature({
  "line": 1,
  "name": "Movie",
  "description": "",
  "id": "movie",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6832677295,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User clicks on Movie to see Summary",
  "description": "",
  "id": "movie;user-clicks-on-movie-to-see-summary",
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
  "name": "user is on Movie page",
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
  "location": "MoviePage_Steps.onMoviePage()"
});
formatter.result({
  "duration": 2524942289,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 363642106,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.MovieSummaryIsDisplayed()"
});
formatter.result({
  "duration": 1639536971,
  "status": "passed"
});
formatter.after({
  "duration": 98250699,
  "status": "passed"
});
formatter.before({
  "duration": 7903129367,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "User checks the review rating of the movie",
  "description": "",
  "id": "movie;user-checks-the-review-rating-of-the-movie",
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
  "name": "user is on Movie page",
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
  "location": "MoviePage_Steps.onMoviePage()"
});
formatter.result({
  "duration": 2914389684,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 413031046,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.ratingsIDisplayed()"
});
formatter.result({
  "duration": 1468333537,
  "status": "passed"
});
formatter.after({
  "duration": 113758703,
  "status": "passed"
});
formatter.before({
  "duration": 6562103007,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User checks the Release date of the movie",
  "description": "",
  "id": "movie;user-checks-the-release-date-of-the-movie",
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
  "name": "user is on Movie page",
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
  "location": "MoviePage_Steps.onMoviePage()"
});
formatter.result({
  "duration": 2260556938,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 362845925,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.releaseDateIsDisplayed()"
});
formatter.result({
  "duration": 1964968879,
  "status": "passed"
});
formatter.after({
  "duration": 139810553,
  "status": "passed"
});
formatter.before({
  "duration": 6407602560,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "User verifies star name is present when user navigates to Summary page and then going back to star tab",
  "description": "",
  "id": "movie;user-verifies-star-name-is-present-when-user-navigates-to-summary-page-and-then-going-back-to-star-tab",
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
  "name": "user is on Movie page",
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
  "location": "MoviePage_Steps.onMoviePage()"
});
formatter.result({
  "duration": 3212863776,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.userClicksOnFirstMovie()"
});
formatter.result({
  "duration": 519880018,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clickingOnGoBackButton()"
});
formatter.result({
  "duration": 1580136013,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clicksOnStarTab()"
});
formatter.result({
  "duration": 945165912,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyStarNameIsDisplayed()"
});
formatter.result({
  "duration": 1084665953,
  "status": "passed"
});
formatter.after({
  "duration": 100827033,
  "status": "passed"
});
formatter.before({
  "duration": 6517041732,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "User clicks on TV tab from Movie page and then again clicks on Movie tab",
  "description": "",
  "id": "movie;user-clicks-on-tv-tab-from-movie-page-and-then-again-clicks-on-movie-tab",
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
  "name": "user is on Movie page",
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
  "location": "MoviePage_Steps.onMoviePage()"
});
formatter.result({
  "duration": 2323445914,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clickingOnTVTab()"
});
formatter.result({
  "duration": 745460441,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyTvContentIsDisplayed()"
});
formatter.result({
  "duration": 1685880579,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.clicksOnMovieTab()"
});
formatter.result({
  "duration": 191747440,
  "status": "passed"
});
formatter.match({
  "location": "MoviePage_Steps.verifyMovieTabIsDisplayed()"
});
formatter.result({
  "duration": 1020134316,
  "status": "passed"
});
formatter.after({
  "duration": 89450741,
  "status": "passed"
});
});