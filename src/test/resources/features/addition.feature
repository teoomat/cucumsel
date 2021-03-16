Feature: Calculator
  In order to avoid silly mistakes As a math idiot I want to be told the sum of two numbers

  @mytag
  Scenario: Add two numbers
    Given I have entered 123 into the calculator
    And I have also entered 123 into the calculator
    When I press add
    Then the result should be 246 on the screen