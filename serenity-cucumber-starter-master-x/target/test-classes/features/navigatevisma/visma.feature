Feature: Validate visma.com page contents

  As a user
  I want to be able navigate the page and trust the page contents

  Background: Home page of visma.com
    Given user navigates to the homepage

  Scenario: You can display national websites country list
    When user accepts cookies
    Then user selects the Contact Us from the dropdown menu
    And user validates the national websites country list is correct
      | Norway         |
      | Sweden         |
      | Finland        |
      | Denmark        |
      | Netherlands    |
      | Latvia         |
      | United Kingdom |
      | Lithuania      |
      | Slovakia       |
      | Romania        |
      | Latin America  |
      | Portugal       |
      | Spain          |
    And user validates if Lithuania page link is working
    And user validates DOM does not have an element Test