Feature: Print Button
Description:

Scenario: Print as a PDF
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	When clicking on the print button
	And assert the print option pop up menu appears
	And clicking on "PRINT AS A PDF" from the print pop up menu
	Then assert the print setting window will open
	
	
Scenario: Close popup windows
	Given the user is on the homepage
	And clicks on the "Client Services" link in the primary navigation
	When clicking on the print button
	And assert the print option pop up menu appears
	And clicking on "CLOSE" from the print pop up menu
	Then assert the print option pop up menu closes