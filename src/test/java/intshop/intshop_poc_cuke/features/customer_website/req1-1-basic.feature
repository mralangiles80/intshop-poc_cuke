Feature: Req 1.1 - Post code verification
In order to verify my postcode
As a New customer
I want to enter my postcode in the postcode filed and find my nearest Intshop Grocery

Scenario Outline: Verify my postcode and find my nearest groceries

Given I launch the Intshop Web application using the <URL> link
When I enter the <Postcode> in the "Type your post code" field
And I click on the "Find Near Groceries" button
Then I see the <NearestGrocery> shop

Examples:
| URL				  | Postcode |NearestGrocery |
| preprod.intshop.com | N32DB    |               |
