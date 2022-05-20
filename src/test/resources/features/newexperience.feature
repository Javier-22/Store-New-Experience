@story
Feature: As a customer the new experience, I want to buy in clothes in the store


@Scenario1
  Scenario: User search items and add to cart
  Given user navigate to new experience page
  When user search and adds items
     | product                        |  qty | size | color  |
     | Faded Short Sleeve T-shirts    |  20  |  M   | Blue   |
     | Printed Chiffon Dress          |  3   |  M   | Green  |
     | Blouse                         |  4   |  L   | White  |
  Then verify quantity of items