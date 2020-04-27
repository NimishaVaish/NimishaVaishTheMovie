Feature: Movie page is launched

 Scenario: Validate that Movies page is shown when application is launched
   Given The application is launched on the mobile device
   When user clicks on any Movie
   Then verify that summary page is opened

