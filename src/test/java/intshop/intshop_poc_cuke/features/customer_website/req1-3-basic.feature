Feature: Req 1.3 - System Notifies customer if driver is not available

In order to verify that I receive a notification message of non-availability of  delivery drivers
As a New customer
I want to receive a system notification when there are no delivery drivers available for my chosen grocery shop and offer 2 alternative options

Scenario Outline: System notifies of the non-availability of the delivery drivers

Given I launch the Intshop Web application using the <URL> link
When I enter the <Postcode> in the "Type your post code" field
And I click on the "Find Near Groceries" button
Then I see the <NearestGrocery> shop
And I click on the "Order" Button next to the <NearestGrocery> shop
And I receive a <NotificationText> message with <OptionOneText> message and <OptionTwoText> message

Examples:
|URL| Postcode |NearestGrocery| NotificationText | OptionOneText | OptionTwoText |
|||||||