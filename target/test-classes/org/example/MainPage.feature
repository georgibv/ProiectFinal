Feature: Main Page
  There tests will verify the functionality of the Main Page

  Scenario: Hybrid section
    Given I am on the first page of the website
    And I scroll to the Hibrid section
    When I click the hybrid Read More button
    And I click the button hybrid Return
    Then I return to the first page of the website

  Scenario: Virtual section
    Given I am on the first page of the website
    And I scroll to the Virtual section
    When I click the virtual Read More button
    And I click the button virtual Return
    Then I return to the first page of the website

  Scenario: Learn The Fundamentals
    Given I am on the first page of the website
    When I click on the section  What You ll Learn
    Then the button it should take me down of the page

  Scenario: The presentation of the instructors
    Given I am on the first page of the website
    When I click on the section  Instructors
    Then the button it will show me the instructors

  Scenario: Sign up page
    Given I am on the first page of the website
    When I click on the button  Start the Enrollment
    Then It should open the sign  up page

  Scenario: Learn The Fundamental Read More
    Given I am on the first page of the website
    And I scroll to the Learn The Fundamental section
    When I click the fundamental Read More link
    And I click the button Learn The Fundamental Return
    Then I return to the first page of the website

  Scenario: Learn Selenium
    Given I am on the first page of the website
    And I scroll to the Learn Selenium  section
    When I click the Read More link Learn Selenium
    And I click the button Learn Selenium Return
    Then I return to the first page of the website

  Scenario: Sign up For Our Newsletter
    Given I am on the first page of the website
    When I introduce a valid email addres
    And I click the signup newsletter Submit button
    Then The pop up it should open with a message

  Scenario: Social media page link for Our Instructors
    Given I am on the first page of the website
    And I scroll to the Our Instructors section
    When I click to the social media link
    Then The link should take the user page

  Scenario: Start the enrollment from
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I enter "Maria" as First Name
    And I enter "mirea" as Last Name
    And I enter "maria" as Username
    And I enter "12356" as Password
    And I enter "12356" as Confirm password
    When I click on personal information form Next button
    Then I am on the contact information form
    And I enter "maria@gmail.com" at email
    And I enter "0748458725" at the Phone
    And I enter "Brasov" at the City
    And I enter "Romania" at the Country
    And I enter "500600" at the Post Code
    When I click on next on contact information form
    Then I am on the course option form
    And I select first option
    When I click on course option form next button
    Then I am on the payment information form
    And I enter "Maria" as Card holder name
    And I enter "4554 4558 4587 4578" as Card number
    And I enter "333" as CVC
    And I select the "august" month
    And I select the "2022" year
    When I click on payment information next button
    Then I view the success form
    And I click on return to homepage from success form
    Then I am on the first page of the website

  Scenario: Start the enrollment from with wrong confirmation password
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I enter "Maria" as First Name
    And I enter "mirea" as Last Name
    And I enter "maria" as Username
    And I enter "12356" as Password
    And I enter "12" as Confirm password
    When I click on personal information form Next button
    Then I stay on the personal information form

  Scenario:Start the enrollment and on payment information form
           Check if card Holder Name, Card Number, CVC, Expiry Date are required
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I enter "Maria" as First Name
    And I enter "mirea" as Last Name
    And I enter "maria" as Username
    And I enter "12356" as Password
    And I enter "12356" as Confirm password
    When I click on personal information form Next button
    Then I am on the contact information form
    And I enter "maria@gmail.com" at email
    And I enter "0748458725" at the Phone
    And I enter "Brasov" at the City
    And I enter "Romania" at the Country
    And I enter "500600" at the Post Code
    When I click on next on contact information form
    Then I am on the course option form
    And I select first option
    When I click on course option form next button
    Then I am on the payment information form
    When I click on payment information next button
    Then I stay on the payment information form
    And I enter "Maria" as Card holder name
    When I click on payment information next button
    Then I stay on the payment information form
    And I enter "4554 4558 4587 4578" as Card number
    When I click on payment information next button
    Then I stay on the payment information form
    And I enter "333" as CVC
    When I click on payment information next button
    Then I stay on the payment information form
    And I select the "august" month
    When I click on payment information next button
    Then I stay on the payment information form
    And I select the "2022" year
    When I click on payment information next button
    Then I view the success form
    And I click on return to homepage from success form
    Then I am on the first page of the website

  Scenario: Start the enrollment and on the  payment information
            The CVC need to be 3 letters long
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I enter "Maria" as First Name
    And I enter "mirea" as Last Name
    And I enter "maria" as Username
    And I enter "12356" as Password
    And I enter "12356" as Confirm password
    When I click on personal information form Next button
    Then I am on the contact information form
    And I enter "maria@gmail.com" at email
    And I enter "0748458725" at the Phone
    And I enter "Brasov" at the City
    And I enter "Romania" at the Country
    And I enter "500600" at the Post Code
    When I click on next on contact information form
    Then I am on the course option form
    And I select first option
    When I click on course option form next button
    Then I am on the payment information form
    And I enter "Maria" as Card holder name
    And I enter "4554 4558 4587 4578" as Card number
    And I select the "august" month
    And I select the "2022" year
    And I enter "3" as CVC
    When I click on payment information next button
    Then I stay on the payment information form
    And I clear CVC
    And I enter "333" as CVC
    When I click on payment information next button
    Then I stay on the payment information form

  Scenario: Start the enrollment do not fill any fields in Contact Information Form
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I enter "Maria" as First Name
    And I enter "mirea" as Last Name
    And I enter "maria" as Username
    And I enter "12356" as Password
    And I enter "12356" as Confirm password
    When I click on personal information form Next button
    Then I am on the contact information form
    And I do not fill anything
    When I click on Next button of Contact Information
    Then I get missing fields validation messages contact information

  Scenario: Start the enrollment do not fill any fields in Personal Information Form
    Given I am on the first page of the website
    And  I click  to Start The Enrollment button
    Then I am on the personal information form
    And I do not fill anything
    When I click on personal information form Next button
    Then I get missing fields validation messages


















