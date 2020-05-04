Feature:Movie

  @run
  Scenario: User clicks on Movie to see Summary of the Movie
    Given user is on Movie tab
    When user clicks on first Movie
    Then verify Summary is displayed


  @run
  Scenario: User checks the review rating of the movie is displayed
    Given user is on Movie tab
    When user clicks on first Movie
    Then verify Ratings is displayed


  @run
  Scenario: User checks the Release date of the movie is displayed
    Given user is on Movie tab
    When user clicks on first Movie
    Then verify ReleaseDate is displayed


  @run
  Scenario: User navigates between Movie and Star tab
    Given user is on Movie tab
    When user clicks on first Movie
    Then user clicks on  go back tab
    When user clicks on star tab
    Then verify star name is present

  @run
  Scenario: User navigates between Movie and TV tab
    Given user is on Movie tab
    When user clicks on TV tab
    Then verify Tv content is displayed
    When user clicks on Movie tab
    Then verify Movie tab is displayed

  @run
  Scenario: User is able to scroll down in the Movie section and new movie is displayed
    Given user is on Movie tab
    When user scrolls down
    Then verify the new movie is displayed




