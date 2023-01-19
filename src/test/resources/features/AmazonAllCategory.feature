@nesibe
Feature: The user can see and select the products in the desired category.

  Background:User sees results for Computers&Tablets
    Given user goes to the Amazon Home Page
    And user clicks All navigation bar
    And user clicks Computers bar
    And user clicks Computers&Tablets bar
    Then user sees results for Computers&Tablets


  Scenario:The user sees the laptops she chooses with the features she/he wants
  and sees the features of a laptop she/he chooses
    When user clicks Laptops from Departments
    And user clicks three stars from Avg. Customer Review
    And user clicks ASUS from Featured Brands
    And user type 200 for min price
    And user type 1000 for max price
    And user clicks Go button
    And user twelve for Processor Count
    And user clicks "16 to 16.9" Inches from Display Size
    And user clicks first result of laptop
    Then user sees information about selected laptop
    And user sees Add to Cart button
    And user sees Buy Now Button


  Scenario: User searches for an answer to her/his question on Visit the help section page
    When user clicks Visit the help section
    And user clicks Amazon Assistant module
    Then user sees Amazon Assistant text
    And user type broken item to Find more solutions field
    And user clicks on Replace a Damaged, Defective, or Broken Item
    Then user sees information about broken item












