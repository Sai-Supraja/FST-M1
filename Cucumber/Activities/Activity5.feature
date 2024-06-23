@activity5
Feature: Login Test
  Scenario Outline: Testing Login without Examples
    Given User is on Login page
    When User enters Username as "<Usernames>" and Password as "<Passwords>"
    Then Read the page title and confirmation message
    And Close the Browser
    Examples:
    | Usernames | Passwords  |
    |  "admin"  | "password" |
    |"adminUser"| "password" |