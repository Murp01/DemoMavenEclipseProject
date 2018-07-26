Feature: Events Search Box

Scenario: Search for an event using a keyword
	Given the user is on the Careers homepage
	And clicking on "Meet Us" from "Title01"
	And clicking in the Events keyword searchbox
	When typing "The" into the Events keyword searchbox
	Then articles matching the search term will be displayed in the Events searchbox
	
Scenario: Clear filters
	Given the user is on the Careers homepage
	And clicking on "Meet Us" from "Title01"
	And clicking in the Events keyword searchbox
	When typing "The" into the Events keyword searchbox
	#And selecting "" from the Location drop down selector
	And selecting "Sort Z-A" from the Sort By drop down selector
	
		