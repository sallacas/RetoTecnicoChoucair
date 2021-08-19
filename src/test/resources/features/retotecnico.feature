# Autor: Johnatan-Casallas | language: en
@stories
Feature: Technical challenge
  As a user, I want to show what I have learned in the test automation given by Choucair.
  @scenario1
  Scenario: Create a new user on the utest.com website
    Given Juan wants to create a user on utest.com
    When He fills out the form to register on utest.com.
    | strFirstName | strLastName | strEmail                | strCity  | strZip | strCountry | strBrand | strModel    | strOs       | strPassword      |
    | Jopsept      | Alfonso     | najek88576@alltekia.com | Ibague   | 730001 | Colombia   | Apple    | iPhone      | iOS 14.7.1  | laclaveA12345.   |
    Then The find the button to complete registration available
    | strWelcomeMessage  |
    | done               |