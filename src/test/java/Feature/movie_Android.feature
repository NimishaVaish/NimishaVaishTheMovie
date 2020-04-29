Feature:Movie

  @run
  Scenario: User clicks on Movie to see Summary
    Given user is on Movie page
    When user clicks on Cars Movie
    Then verify Summary is displayed


  @run
  Scenario: User checks the review rating of the movie
    Given user is on Movie page
    When user clicks on Cars Movie
    Then verify Ratings is displayed


  @run
  Scenario: User checks the Release date of the movie
    Given user is on Movie page
    When user clicks on Cars Movie
    Then verify ReleaseDate is displayed


  @run
  Scenario: User verifies star name is present when user navigates to Summary page and then going back to star tab
    Given user is on Movie page
    When user clicks on Cars Movie
    Then user clicks on  go back tab
    When user clicks on star tab
    Then verify star name is present

  @run
  Scenario: User clicks on TV tab from Movie page
    Given user is on Movie page
    When user clicks on TV tab
    Then verify TV tab is displayed

