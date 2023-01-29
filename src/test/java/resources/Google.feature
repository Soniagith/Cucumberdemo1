
Feature: Google Search
  I want to search akeyword in google
  @validcredentials
  Scenario: Google Search
    Given browser window is open
    And Enter url
    When Google is opened
    Then search "<searchtext>" with google
    And click Enter
    
    Examples:
    |searchtext|
    |google|
    |facebook|
    |tesla|
    
