@tag
Feature: Calculator

  Scenario: add two numbers
    Given Two input values, 1 and 2
    When I add the two values
    Then I expect the result 3

  Scenario Outline: add two numbers
    Given Two input values, <first> and <second>
    When I add the two values
    Then I expect the result <result>

    Examples:
      | first | second | result |
      | 1     | 12     | 13     |
      | -1    | 6      | 5  	    |
      | 2     | 2      | 4	    |

  Scenario Outline: new ops
    Given Two input values , <Input> and <opt>
    When I op the two values
    Then I expect this result <result>

    Examples:
      | Input | opt | result |
      | 4 | rvs | 0.25 |
      | 4 | sqr | 2 |