Feature: Automated End2End Tests
Description:

Scenario: Register to an event
	Given the user is on the homepage
	And the clicks on Events from the title header
	When the user enters a search term into the events search widget
	And clicks view more on an event box
	And clicks register
	Then then the user is registered to the eventt


