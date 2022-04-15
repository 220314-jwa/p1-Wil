#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
   Feature: user login
   
   Scenario: successful login
   Given the user is on the homepage
   When the user enters the correct username and password
   And the user clicks the login button 
   Then the nav will show the user's first name. 
   
   
   Scenario: username does not exist
   Given the user is on the homepage
   When the user enters an incorrect username
   And the user clicks the login button
   Then an incorrect credentials mnessage will be displayed.
   
   Scenario: incorrect password
   Given the user is on the homepage
   When the user enters an incorrect password
   And the user clicks the login button
   Then an incorrect credentials message will be displayed 
   
   Scenario: incorrect input
   Given the user is on the homepage
   When the user enters the username"<username>"
   And the user enters the password "<password>"
   And the user clicks the login button
   Then an invalid input message will be displayed 
   

   
   
   
   
   
