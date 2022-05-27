@story
Feature: As a customer the new experience, I want to buy in clothes in the store


@Scenario1
  Scenario: User registers and searches for items to add to cart
  Given user navigate to new experience page
  When  The user on the start button and validate the email and register
    |strEmail       |strPasswd|strFistName  |strLastName|strAddress       |strCity  |strState|strCodePostal|strCountry   |strMobile  |strReference|
    |TestJacho      |10we@B   |Pepito       |Perez      |841 Broadway #600|New York |New York|10002        |United States|16469803291|One         |
  And user search and adds items
     | product                        |  qty | size | color  |
     | Faded Short Sleeve T-shirts    |  20  |  M   | Blue   |
     | Printed Chiffon Dress          |  3   |  M   | Green  |
     | Blouse                         |  4   |  L   | White  |
  Then verify quantity of items