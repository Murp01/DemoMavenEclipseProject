Feature: Accordian Widget
Description


Scenario: Open and close accordion widget tabs
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	Then asserts the accordion module is located on the page
	And clicks on "Tab01" of the accordion module
	Then asserts "Tab01" accordion content is visible
	And clicks on "Tab01" of the accordion module
	
Scenario: Open each accordion widget tab
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	Then asserts the accordion module is located on the page
	And clicks on "Tab01" of the accordion module
	And clicks on "Tab02" of the accordion module
	And clicks on "Tab03" of the accordion module	
	