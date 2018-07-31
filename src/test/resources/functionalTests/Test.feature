Feature: Test feature
Description:

@Trythis
Scenario: Print as a PDF
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	When clicking on the print button
	And assert the print option pop up menu appears
	And clicking on "PRINT AS A PDF" from the print pop up menu
	Then assert the print setting window will open





	
	
	