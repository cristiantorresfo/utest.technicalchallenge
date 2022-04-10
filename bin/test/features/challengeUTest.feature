#Autor: Cristian Torres
@Stories
Feature: Challenge UTest
  As a user, I want to register on the UTest platform
  @scenario1
  Scenario: Create a new user on UTest
    Given User is on home page
    When User fills the register form
    Then the user finds the complete setup button
