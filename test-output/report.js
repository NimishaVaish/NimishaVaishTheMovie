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
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks on any Movie",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "verify that summary page is opened",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});