# Autor: Johnatan-Casallas | language: en
@stories
Feature: Technical challenge
  As a user, I want to show what I have learned in the test automation given by Choucair.
  @scenario1
  Scenario: Create a new user on the utest.com website
    Given Juan wants to create a user on utest.com
    When He fills out the form to register on utest.com.
    | strFirstName | strLastName | strEmail             | strCity  | strZip | strCountry | strBrand | strModel         | strOs      | strPassword   |
    | Pedro        | Garcia      | pbretojd@yopmail.com | Medellin | 000000 | Colombia   | Xiaomi   | Redmi Note 5 Pro | Android 10 | Unapass12345. |
    Then He finds a welcome message to utest.com
    | strWelcomeMessage                                                       |
    | Welcome to the world's largest community of freelance software testers! |