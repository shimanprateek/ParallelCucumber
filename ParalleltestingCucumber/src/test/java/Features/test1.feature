@Smoke1
Feature: LogIn to Facebook Session1

@Regression
Scenario: LogIn
Given I am on facebook page "Chrome"
When I login with credentials
Then I logout