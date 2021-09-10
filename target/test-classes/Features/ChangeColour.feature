Feature:Change in the image using Color Feature

  @t4
  Scenario: User will able to change image colour
    Given User is Signed in
    And user selected the category as T-shirts
    And user clicked on product
    When user clicks on blue colour link
    Then image will changed
