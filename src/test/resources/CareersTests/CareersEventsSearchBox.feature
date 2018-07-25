Feature: Events Search Box

Scenario: Search for an event using a keyword
	Given the user is on the Careers homepage
	And clicking on "Meet Us" from "Title01"
	And clicking in the Events keyword searchbox
	When typing "The" into the Events keyword searchbox
	Then articles matching the search term will be displayed in the Events searchbox
	
	