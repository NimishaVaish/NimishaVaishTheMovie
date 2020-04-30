Feature:Movie

  @run
  Scenario: User clicks on Movie to see Summary
    Given user is on Movie page
    When user clicks on first Movie
    Then verify Summary is displayed


  @run
  Scenario: User checks the review rating of the movie
    Given user is on Movie page
    When user clicks on first Movie
    Then verify Ratings is displayed


  @run
  Scenario: User checks the Release date of the movie
    Given user is on Movie page
    When user clicks on first Movie
    Then verify ReleaseDate is displayed


  @run
  Scenario: User verifies star name is present when user navigates to Summary page and then going back to star tab
    Given user is on Movie page
    When user clicks on first Movie
    Then user clicks on  go back tab
    When user clicks on star tab
    Then verify star name is present

  @run
  Scenario: User clicks on TV tab from Movie page and then again clicks on Movie tab
    Given user is on Movie page
    When user clicks on TV tab
    Then verify Tv content is displayed
    When user clicks on Movie tab
    Then verify Movie tab is displayed



