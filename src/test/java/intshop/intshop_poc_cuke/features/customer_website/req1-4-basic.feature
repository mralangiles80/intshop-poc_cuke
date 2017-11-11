Feature: Req 1.4 - Add an item to the basket
In order to add an item into the basket
As a New customer
I want to select a grocery item from my nearest grocery shop and add it to the basket

Scenario Outline: Add an item to the basket 

Given I launch the Intshop Web application using the <URL> link
When I enter the <Postcode> in the "Type your post code" field
And I click on the "Find Near Groceries" button
Then I see the <NearestGrocery> shop
And I click on the "Order" Button next to the <NearestGrocery> shop
And I click on the "Drink" menu under the Product Category heading
And I click on the "Alcohol Gifts" menu within the "Drink" menu under the Product Category heading
And I click on the "Champagne&wine" within the "Alcohol Gifts" menu and see the <ItemName> name appearing in the Items section
And I click on the "Add" icon next to the <ItemName> name 
Then I see the <ItemName> name appearing in the "Your Order" basket

Examples:
|URL| Postcode |NearestGrocery | ItemName |
|||||