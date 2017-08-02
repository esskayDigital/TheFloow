Feature: Create_Customer

  Scenario Outline: CreateNewCustomer
    Given I am creating a customer
    When I use name <firstname> lastname <lastname> email <email>
    Then new customer is created
    Examples:
    |firstname      |lastname   |email              |
    |shane          |kelly      |shanek@gmail.com   |
    |firstest       |surtest    |testtest@gmail.com |


  Scenario: CreateInvalidCustomer
    Given I am creating a customer
    When I use a <CurrentCustomer>
    Then an error is received

    #you can create a shae@esskay.digital customer on iOS
  # but you cannot log in on Android.