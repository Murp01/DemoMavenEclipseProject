Feature: Automated End2End Tests
Description:

@Trythis
Scenario: Open Insights article detail page
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	Then asserts the accordion module is located on the page
	And clicks on "Tab01" of the accordion module
	Then asserts "Tab01" accordion content is visible
	And clicks on "Tab01" of the accordion module
	Then asserts "Tab01" accodion content is hidden



	
	
	