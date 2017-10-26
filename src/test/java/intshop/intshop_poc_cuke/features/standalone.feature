Feature: Standalone
	In order to verify the login page is working properly 
	As a test automater
	I want to launch webdriver and check the intstop page loads
					 
Scenario: Check Elements on Login Page
Given I launch the browser and go to the correct URL
When I click on the Login link on the landing page
Then I see all the elements on the page