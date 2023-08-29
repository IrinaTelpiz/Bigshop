Feature: Registration, login, search and add goods on Bigshop

  As a customer of online store
  I want to register, login and add goods to cart
  So that I can control my orders

  @Registration
  Scenario Outline: Register in the online store
    Given the registration page is open
    When the user enters valid <name>, <phone number>, <email>, <password>
    Then the user is registered
    Examples:
      | name | phone number | email | password |
      | TestName | 069xxxxxxxx | test@gmail.com | testPassword |

  @InvalidPassword
  Scenario Outline: Try to login with invalid password
    Given the registration page is open
    When the user enters valid <email> and invalid <password>
    Then the user sees a warning
    Examples:
      | email | password |
      | test@gmail.com | testInvalidPassword |

  @Login
  Scenario Outline: Login in to the online store
    Given the login page is open
    When the user enters valid <email> and <password>
    Then the user is logged in
    Examples:
      | email | password |
      | test@email.com | testPassword |

  @Search
  Scenario Outline: Search for an item
    Given the user is on main page
    When the user enters name of <product> in the searchbar
    Then related to search products are displayed on page
    Examples:
      | product |
      | masa |


  @AddProduct
  Scenario: Add product to cart
    Given the user is on main page
    When the user enters name of the product in the searchbar
    And adds it to cart
    Then the cart counter is updated by 1

  @RemoveAllProducts
  Scenario: Removing product from cart
    Given the user has items in the cart
    When the user deletes all items from cart
    Then the cart is empty

  @IncreaseQuantity
  Scenario: Increasing the quantity in the cart
    Given the user has an item in the cart
    When the user increases the quantity of the item
    Then the total price accordingly changed




