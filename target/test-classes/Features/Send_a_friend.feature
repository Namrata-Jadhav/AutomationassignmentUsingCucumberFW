Feature: Send a friend feature

  @t2
  Scenario: User will able to send product details to a friend
    Given User is Signed in
    When user enters email id as "signup@example.com" and password as "26April@2015" and clicks on sign In button:"
    When User Selects  T-shirts link
    And User clicks on the checkbox of product as Short sleeves and clicks on more button
    And user clicks on the send to a friend link
    And user enter following details and click on send button:
      | Name of your friend          | Shraddha           |
      | Email address of your friend | shraddha@gmail.com |
    Then message will be as email sent to your friend successfully