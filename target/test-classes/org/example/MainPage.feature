Feature: Main Page
  There tests will verify the functionality of the Main Page

  Scenario: Hybrid section
    Given I am the first page of the website
    And I scroll to the Hibrid section
    When I click the Read More button
    And I click the button Return
    Then I return to the first page of the website

  Scenario: Virtual section
    Given I am on the first page of the website
    And I scroll to the Virtual section
    When I click the Read More button
    And I click the button Return
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
    Given I am the first page of the website
    And I scroll to the Learn The Fundamental section
    When I click the Read More link
    And I click the button Learn The Fundamental Return
    Then I return to the first page of the website

  Scenario: Learn Selenium
    Given I am the first page of the website
    And I scroll to the Learn Selenium  section
    When I click the Read More link Learn Selenium
    And I click the button Learn Selenium Return
    Then I return to the first page of the website

  Scenario: Sign up For Our Newsletter
    Given I am on the first page of the website
    When I introduce a valid email addres
    And I click the Submit  button
    Then The pop up it should open with a message






