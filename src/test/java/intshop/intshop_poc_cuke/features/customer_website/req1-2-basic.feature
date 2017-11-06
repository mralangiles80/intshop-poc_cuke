Feature: Req 1.2 - List the shop by search criteria

In order to view my nearest shops filtered by search criteria
As a New customer
I want to view all my nearest shops displaying distance to customer, average rating and open/closed status

Scenario Outline: View my shops by the search criteria

Given I launch the Intshop Web application using the <URL> link
When I enter the <Postcode> in the "Type your post code" field
And I click on the "Find Near Groceries" button
Then I see the <NearestGrocery> shop
And I see the <DistanceToCustomer> info in the "Grocery Filter" filter
And I see the <AverageRating> info in the "Grocery Filter" filter
And I see the <Status> info in the "Grocery Filter" filter

Examples:
|URL| Postcode |NearestGrocery| DistanceToCustomer | AverageRating | Status |
|||||||