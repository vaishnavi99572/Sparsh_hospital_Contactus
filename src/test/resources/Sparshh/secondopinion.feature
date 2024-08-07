
@tag
Feature: Second opinion

  @tag1
  Scenario: 	To validate the second opinion functionality
    Given Open the browser, enter the sparsh hospital URL
    And Select  yeshwantpur hospital from hospital dropdown
    When user  clicks the second opinion link
    And user enters a firstname,lastname, phoneNo , email 
    And upload a report Enters a messgae ,click on send button  
    Then Thankyou message displayed
    And Bank info available

 # @tag2
  #Scenario Outline: Title of your scenario outline
   # Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step

    #Examples: 
     # | name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
