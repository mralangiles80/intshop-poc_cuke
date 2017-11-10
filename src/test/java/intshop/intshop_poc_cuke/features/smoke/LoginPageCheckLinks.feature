Feature: Login Page Elements
	In order to verify the login page is working properly 
	As a user
	I want to see all the visible login page elements 
					 
Scenario: Login Page Elements
Given I launch my browser and navigate to the IntShop homepage
When I click on the Login button on the IntShop homepage
Then I see the Welcome message on the IntShop login page
And I see the Login button on the IntShop login page
And I see the Intshop header logo on the IntShop login page
And I see the Forgot Password link on the IntShop login page