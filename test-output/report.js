$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/Movie.feature");
formatter.feature({
  "name": "Movie page is launched",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate that Movies page is shown when application is launched",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "The application is launched on the mobile device",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefinitions.MovieP.theApplicationIsLaunchedOnTheMobileDevice()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on any Movie",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefinitions.MovieP.clickOnMovie()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify that summary page is opened",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefinitions.MovieP.verifySummaryPage()"
});
formatter.result({
  "status": "skipped"
});
});