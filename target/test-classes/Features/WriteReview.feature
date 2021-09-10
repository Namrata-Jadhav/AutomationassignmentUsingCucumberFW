Feature: Write a Review feature

  @t3
  Scenario: User will able to write a review
    Given User is Signed in
    Given user selected the category as T-shirts
    Given user clicked on product
    When user clicks on write a review link
    When user writes tile and comment, and clicks on send button
    Then New comment message is displayed