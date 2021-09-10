Feature: Sign Up feature

  @t1
  Scenario: User will able to sign up for accessing the application
    Given user opened the browser
    And user Navigated to the application url
    When user clicks the link sign in
    And user enters email id as "signupToCreateAccount@example.com" and clicks on Create an account button to fill up the form
    And user enters the personal information as follows and clicks on Register button:
      | Title         | Mrs                                |
      | First_name    | Namrata                            |
      | Last_name     | Jadhav                             |
     # | Email         | jadhavnamrata@gmail.com            |
      | Password      | 26April@2015                       |
    #  | Date_of_Birth | 19 May 1994                        |
      | First_Name    | Namrata                            |
      | Last_Name     | Jadhav                             |
      | Company       | xyz pvt ltd                        |
      | Address       | Plot no. 12, Nagpur chawl, Yerwada |
      | Address_Line2 | airport road, near post office     |
      | city          | pune                               |
     # | state         | California                         |
      | zip_code      | 00000                              |
      | country       | United States                      |
      | mobile_number | 9923456789                         |
    Then new account is created






