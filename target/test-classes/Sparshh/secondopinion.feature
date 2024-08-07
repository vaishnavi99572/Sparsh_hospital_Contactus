
@Second
Feature: Second opinion

  @SecondOpinion
  Scenario: 	To validate the second opinion functionality
    Given Open the browser, enter the sparsh hospital URL
    And Select  yeshwantpur hospital from hospital dropdown
    When user  clicks the second opinion link
    And user enters a firstname,lastname, phoneNo , email 
    And upload a report Enters a messgae ,click on send button  
    Then Thankyou message displayed
    And Bank info available

  @tag2
  Scenario Outline: To validate the second opinion functionality with multiple data
    Given Open the browser, enter the sparsh hospital URL
    And Select  yeshwantpur hospital from hospital dropdown
    When user  clicks the second opinion link
    And user enters a "<firstname>","<lastname>", "<phoneNo>" , "<email>" 
    And upload a report Enters a messgae ,click on send button  
    Then Thankyou message displayed
    And Bank info available
    
    

    Examples: 
      | firstname| lastname | phoneNo   |email             |
      | vaish123 |  lakh%   | 87974536  | 123@gmail.com    |
      | vaishnavi|       @% | 890001234 | ok@gmail.com     |
      |vaishnavi |   lakhore|8989235478 |vaishulakhore@gmail.com|
