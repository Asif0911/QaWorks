@ContactUS
  Feature: Contact us page
    As an End user
    I want a contact us page
    So that i can find out more about QAWorks exciting services

    Scenario Outline: Valid Submission
     // Given I am on the QAWorks site
      //Then I should be able to contact QAWorks with the following information

      Given user is on QAWorks page
      When user clicks on TabName
      Then user should navigate to contact page
      When user enters the <Name>,<Email> and <Message>
      When user clicks on send button
      Then confirmation message should display


      Examples:
        |Name  | Email |Message|
        |"j.Bloggs 6"|"j.Bloggs@qaworks.com"|"please contact me i want to find out more"|