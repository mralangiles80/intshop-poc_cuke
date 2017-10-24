Feature: CheckLoginLinks
	In order to verify the login page is working properly 
	As a User
	I want to check all the elements are present
					 
Scenario: Check Elements on Login Page
Given I launch the browser and go to the correct URL
When I click on the Login link on the landing page
Then I see all the elements on the page