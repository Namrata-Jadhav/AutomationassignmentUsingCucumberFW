Feature:End To End User Journey Feature

  @t5
  Scenario: user will able to purchase product via end to end user journey
    Given User is Signed in
    And user selected the category as T-shirts
    And  user clicked on product
    When user will fetch the amount of product
    And user will increase quantity by 2 and size by L and,clicks on add to Cart button
    And  User sees the Pop Up: Product Successfully Added to Cart
    And clicks on proceed to checkout button and check the validations
    And  clicks on button
    And clicks on proceed to checkout again and reach till payment and click on Terms and condition check box
    And On Payment Page click on Pay by bank wire and Click on I confirm my Order
    Then  message "Your order on My Store is complete is displayed" is displayed




