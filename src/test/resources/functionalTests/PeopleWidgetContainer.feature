Feature: People widget container

Scenario: Asserts correct details page is opened from person profile
	Given the user is on the homepage
	And clicks on the "About Us" link in the primary navigation
	And asserts people widget is visible on the page
	And clicks on the "first" characters profile
	Then asserts the correct persons details page opens